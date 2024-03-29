package ua.lviv.iot.models;

public class FoodContainers extends GoodsInfo{
    public FoodContainers(String materialSet, int weightSet, String colourSet) {
        super(materialSet, weightSet, colourSet);
    }
    @Override
    public String getHeader() {
        return String.format("%s, %s, %s", super.getHeader());
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s", super.toCSV());
    }

    @Override
    public String toString() {
        return "FoodContainers";
    }
}