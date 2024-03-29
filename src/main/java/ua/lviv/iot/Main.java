package ua.lviv.iot;
import ua.lviv.iot.manager.Text;
import ua.lviv.iot.manager.Writer;
import ua.lviv.iot.manager.Manager;
import ua.lviv.iot.models.GoodsInfo;
import ua.lviv.iot.models.BreadBins;
import ua.lviv.iot.models.FoodContainers;
import ua.lviv.iot.models.Thermoses;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args){
        BreadBins bob1 = new BreadBins("ff", 1, "red");
        Thermoses bob2 = new Thermoses("ss", 2, "blue");
        FoodContainers bob3 = new FoodContainers("gg", 3, "Aqua");

        Manager manager = new Manager();

        manager.addGoods(bob1);
        manager.addGoods(bob2);
        manager.addGoods(bob3);

        System.out.println(manager.sortByColour(true));
        System.out.println(manager.sortByWeight(false));
        System.out.println(manager.findByMaterial("ff"));

        List<GoodsInfo> list = Arrays.asList(bob1, bob2, bob3);

        Writer writer = new Writer();
        writer.writeToFile(list);
        Text text = new Text();
        text.deleteWordsWithDigitsNumberLessThen5("b12345b aa1234c Ab4714EX bas1-2-3-4-5bas Adfda12-47-56basdA");

    }
}

