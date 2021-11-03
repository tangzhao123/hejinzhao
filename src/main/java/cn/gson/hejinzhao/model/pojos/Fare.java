package cn.gson.hejinzhao.model.pojos;

public class Fare {
    private int fareId; //序号
    private int minValue; //最大值
    private int  maxValue;//最小值
    private int price; //票价

    public int getFareId() {
        return fareId;
    }

    public void setFareId(int fareId) {
        this.fareId = fareId;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fare{" +
                "fareId=" + fareId +
                ", minValue=" + minValue +
                ", maxValue=" + maxValue +
                ", price=" + price +
                '}';
    }
}
