package com.pos.min_mart.DTO;

public class fruitDTO {

    private int fruitNum; /*과일번호*/
    private String fruitName; /*과일명*/
    private int fruitPrice; /*금액*/

    public fruitDTO() {
    }

    public fruitDTO(int fruitNum, String fruitName, int fruitPrice) {
        this.fruitNum = fruitNum;
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
    }

    public int getFruitNum() {
        return fruitNum;
    }

    public void setFruitNum(int fruitNum) {
        this.fruitNum = fruitNum;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    @Override
    public String toString() {
        return "fruitDTO{" +
                "fruitNum=" + fruitNum +
                ", fruitName='" + fruitName + '\'' +
                ", fruitPrice=" + fruitPrice +
                '}';
    }

}
