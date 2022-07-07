package main.java.ua.lviv.iot;
import main.java.ua.lviv.iot.manager.impl.Writer;
import main.java.ua.lviv.iot.manager.impl.Manager;
import main.java.ua.lviv.iot.models.GoodsInfo;
import main.java.ua.lviv.iot.models.BreadBins;
import main.java.ua.lviv.iot.models.FoodContainers;
import main.java.ua.lviv.iot.models.Thermoses;
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


    }
}

