package com.pos.min_mart.DTO;

import java.util.Date;

public class calculateDTO {

    private java.util.Date calculateDate; /*정산일*/
    private int productNum; /*제품번호*/
    private int totalPrice; /*총가격*/
    private int totalWeight; /*총중량*/

    public calculateDTO() {
    }

    public calculateDTO(Date calculateDate, int productNum, int totalPrice, int totalWeight) {
        this.calculateDate = calculateDate;
        this.productNum = productNum;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public Date getCalculateDate() {
        return calculateDate;
    }

    public void setCalculateDate(Date calculateDate) {
        this.calculateDate = calculateDate;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString() {
        return "calculateDTO{" +
                "calculateDate=" + calculateDate +
                ", productNum=" + productNum +
                ", totalPrice=" + totalPrice +
                ", totalWeight=" + totalWeight +
                '}';
    }

}
