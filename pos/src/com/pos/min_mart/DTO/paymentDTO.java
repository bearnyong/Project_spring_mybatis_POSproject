package com.pos.min_mart.DTO;

public class paymentDTO {

    private int oorderNum; /*주문번호*/
    private int totalPrice; /*총가격*/

    public paymentDTO() {
    }

    public paymentDTO(int oorderNum, int totalPrice) {
        this.oorderNum = oorderNum;
        this.totalPrice = totalPrice;
    }

    public int getOorderNum() {
        return oorderNum;
    }

    public void setOorderNum(int oorderNum) {
        this.oorderNum = oorderNum;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "paymentDTO{" +
                "oorderNum=" + oorderNum +
                ", totalPrice=" + totalPrice +
                '}';
    }

}
