package ua.lviv.iot.manager;
import ua.lviv.iot.manager.impl.IGoodsManager;
import ua.lviv.iot.models.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Manager implements IGoodsManager {

    private final List<GoodsInfo> listOfInfo = new LinkedList<>();

    @Override
    public void addGoods(GoodsInfo goodsInfo) {
        listOfInfo.add(goodsInfo);
    }

    @Override
    public List<GoodsInfo> sortByWeight(boolean reverse) {
        if (reverse) {
            return listOfInfo.stream().sorted(Comparator.comparing(GoodsInfo::getWeight).reversed()).collect(Collectors.toList());
        } else {
            return listOfInfo.stream().sorted(Comparator.comparing(GoodsInfo::getWeight)).collect(Collectors.toList());
        }
    }

    @Override
    public List<GoodsInfo> sortByColour(boolean reverse) {
        if (reverse) {
            return listOfInfo.stream().sorted(Comparator.comparing(GoodsInfo::getColour).reversed()).collect(Collectors.toList());
        } else {
            return listOfInfo.stream().sorted(Comparator.comparing(GoodsInfo::getColour)).collect(Collectors.toList());
        }
    }

    @Override
    public List<GoodsInfo> findByMaterial(String material) {
        List<GoodsInfo> typeOfGoods = new LinkedList<>();
        listOfInfo.forEach((goodsInfo -> {
            if (Objects.equals(goodsInfo.getMaterialType(), material))
                typeOfGoods.add(goodsInfo);
        }));
        return typeOfGoods;
    }

}


