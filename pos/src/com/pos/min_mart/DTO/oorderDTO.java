package com.pos.min_mart.DTO;

public class oorderDTO {

    private int oorderNum; /*주문번호*/
    private int productNum; /*제품번호*/
    private int weight; /*중량*/

    public oorderDTO() {
    }

    public oorderDTO(int oorderNum, int productNum, int weight) {
        this.oorderNum = oorderNum;
        this.productNum = productNum;
        this.weight = weight;
    }

    public int getOorderNum() {
        return oorderNum;
    }

    public void setOorderNum(int oorderNum) {
        this.oorderNum = oorderNum;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "oorderDTO{" +
                "oorderNum=" + oorderNum +
                ", productNum=" + productNum +
                ", weight=" + weight +
                '}';
    }

}
