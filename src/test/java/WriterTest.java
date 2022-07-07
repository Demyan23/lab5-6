package test.java;

import main.java.ua.lviv.iot.manager.impl.Writer;
import main.java.ua.lviv.iot.models.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WriterTest {

    private final BreadBins bob1 = new BreadBins("ff", 1, "red");
    private final Thermoses bob2 = new Thermoses("ss", 2, "blue");
    private final FoodContainers bob3 = new FoodContainers("gg", 3, "Aqua");

    @Test
    void writeToFile(){
        List<GoodsInfo> listTest = Arrays.asList(bob1, bob2, bob3);
        Writer writer = new Writer();
        writer.writeToFile(listTest);

        String readerEx = String.format("%s%s%s", System.getProperty("user.dir"), File.separator, "src\\test\\resources", File.separator, "example.csv");
        String readerRes = String.format("%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv");
        try {
            BufferedReader readerResult = new BufferedReader(new FileReader(readerRes));
            BufferedReader readerExample = new BufferedReader(new FileReader(readerEx));
            assertEquals(readerExample.readLine(), readerResult.readLine());
            assertNotEquals(null, readerResult.readLine());
            assertNotEquals(readerExample.readLine(), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


