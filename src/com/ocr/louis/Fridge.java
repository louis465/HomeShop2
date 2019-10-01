package com.ocr.louis;

public class Fridge extends product {
    private int liter;
    private boolean freezer;

    public Fridge(String name, String description, double price, int liter, boolean freeer) {
        super ( name,description, price);
        this.liter = liter;
        this.freezer = freezer;
    }
    public int getLiter () {
        return liter;
    }
    public boolean isFreezer () {
        return freezer;
    }
}
