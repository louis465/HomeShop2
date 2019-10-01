package com.ocr.louis;

public class DirectDelivery implements Delivery {
    double deliveryPrice = 4.99;
    @Override
    public double getPrice() {
        return deliveryPrice;
    }
}