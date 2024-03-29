package test.java;

import java.util.Arrays;
import java.util.List;

import ua.lviv.iot.manager.Manager;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    private final Manager goods = new Manager();
    private final BreadBins bob1 = new BreadBins("ff", 1, "red");
    private final Thermoses bob2 = new Thermoses("ss", 2, "blue");
    private final FoodContainers bob3 = new FoodContainers("gg", 3, "Aqua");

    @Test
    void addGoods() {
        try {
            goods.addGoods(bob1);
            java.lang.reflect.Field privateField = Manager.class.getDeclaredField("listOfInfo");
            privateField.setAccessible(true);
            List<GoodsInfo> listTest = (List<GoodsInfo>) privateField.get(goods);
            assertEquals(bob1, listTest.get(listTest.size() - 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void sortByWeight() {
        goods.addGoods(bob1);
        goods.addGoods(bob2);
        goods.addGoods(bob3);
        List<GoodsInfo> listTest = Arrays.asList(bob1, bob2, bob3);
        assertEquals(listTest, goods.sortByWeight(false));
    }

    @Test
    void sortByColour() {
        goods.addGoods(bob1);
        goods.addGoods(bob2);
        goods.addGoods(bob3);
        List<GoodsInfo> listTest = Arrays.asList(bob1, bob2, bob3);
        assertEquals(listTest, goods.sortByColour(true));
    }

    @Test void findByMaterialType(){
        goods.addGoods(bob1);
        List<GoodsInfo> listTest = Arrays.asList(bob1);
        assertEquals(listTest, goods.findByMaterial("ff"));
    }
}
