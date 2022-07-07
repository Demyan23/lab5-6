package main.java.ua.lviv.iot.manager.impl;

import main.java.ua.lviv.iot.models.GoodsInfo;
import java.io.IOException;
import java.util.List;
import java.io.FileWriter;
import java.io.File;


    public class Writer implements IWriter{
        public void writeToFile(final List<GoodsInfo> goodsInfos){
            String path = String.format("%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv");
            try (FileWriter writer = new FileWriter(path)) {
                for (GoodsInfo goodsInfo : goodsInfos) {
                    writer.write(goodsInfo.getHeader());
                    writer.write(goodsInfo.toCSV());

                }
            }catch (IOException e){
                e.printStackTrace();
            }
        };
    }


