package com.pos.min_mart.DTO;

public class vegetableDTO {

    private int vegNum; /*채소번호*/
    private String vegName; /*채소명*/
    private int vegPrice; /*금액*/

    public vegetableDTO() {
    }

    public vegetableDTO(int vegNum, String vegName, int vegPrice) {
        this.vegNum = vegNum;
        this.vegName = vegName;
        this.vegPrice = vegPrice;
    }

    public int getVegNum() {
        return vegNum;
    }

    public void setVegNum(int vegNum) {
        this.vegNum = vegNum;
    }

    public String getVegName() {
        return vegName;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }

    public int getVegPrice() {
        return vegPrice;
    }

    public void setVegPrice(int vegPrice) {
        this.vegPrice = vegPrice;
    }

    @Override
    public String toString() {
        return "vegetableDTO{" +
                "vegNum=" + vegNum +
                ", vegName='" + vegName + '\'' +
                ", vegPrice=" + vegPrice +
                '}';
    }

}
