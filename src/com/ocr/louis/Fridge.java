package com.ocr.louis;

public class Fridge extends product {
    private int liter;
    private boolean freezer;

    public Fridge(int liter, boolean freeer, String name, String description, double price) {
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
