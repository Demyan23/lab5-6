package ua.lviv.iot.models;

public class BreadBins extends GoodsInfo {
    public BreadBins(String material, int weight, String colour) {
        super(material, weight, colour);
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
        return "BreadBins";
    }
}
