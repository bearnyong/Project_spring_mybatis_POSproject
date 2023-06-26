package com.pos.min_mart.DTO;

public class productDTO {

    private int productNum; /*제품번호*/
    private int fruitNum; /*과일번호*/
    private int vegNum; /*채소번호*/
    private String unit; /*단위*/

    public productDTO() {
    }

    public productDTO(int productNum, int fruitNum, int vegNum, String unit) {
        this.productNum = productNum;
        this.fruitNum = fruitNum;
        this.vegNum = vegNum;
        this.unit = unit;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public int getFruitNum() {
        return fruitNum;
    }

    public void setFruitNum(int fruitNum) {
        this.fruitNum = fruitNum;
    }

    public int getVegNum() {
        return vegNum;
    }

    public void setVegNum(int vegNum) {
        this.vegNum = vegNum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "productDTO{" +
                "productNum=" + productNum +
                ", fruitNum=" + fruitNum +
                ", vegNum=" + vegNum +
                ", unit='" + unit + '\'' +
                '}';
    }

}
