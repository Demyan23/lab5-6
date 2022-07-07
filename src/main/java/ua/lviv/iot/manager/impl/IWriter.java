package main.java.ua.lviv.iot.manager.impl;


import main.java.ua.lviv.iot.models.GoodsInfo;
import java.io.IOException;
import java.util.List;

    public interface IWriter{
        void writeToFile(List<GoodsInfo> goodsInfos) throws IOException;
    }
