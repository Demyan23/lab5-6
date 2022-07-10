package ua.lviv.iot.manager.impl;
import ua.lviv.iot.models.GoodsInfo;
import java.util.List;

public interface  IGoodsManager {
    void addGoods(GoodsInfo goodsInfo);

    List<GoodsInfo> sortByWeight(boolean reverse);
    List<GoodsInfo> sortByColour(boolean reverse);
    List<GoodsInfo> findByMaterial(String material);

}
