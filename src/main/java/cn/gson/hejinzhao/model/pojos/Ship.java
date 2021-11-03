package cn.gson.hejinzhao.model.pojos;

public class Ship {

    private int shipId; //序号
    private String shipName; //关系名称

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipId=" + shipId +
                ", shipName='" + shipName + '\'' +
                '}';
    }
}
