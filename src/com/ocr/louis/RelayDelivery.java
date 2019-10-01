package com.ocr.louis;

public class RelayDelivery implements Delivery {
    private int nb;

    public RelayDelivery (int nb) {
        this.nb = nb;
    }

    @Override
    public double getPrice() {
        if (nb <= 22) {
            return  0;
        } else if (nb > 22 & nb <= 47) {
            return  2.99;
        } else {
            return  4.99;
        }
    }
}

