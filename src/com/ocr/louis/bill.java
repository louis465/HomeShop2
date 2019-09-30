package com.ocr.louis;

import java.util.Map;

public class bill {
    private Customer customer;
    private Map<product, Integer> products;

    public void addProduct (product product, Integer quantity) {
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<product,Integer> getProducts() {
        return products;
    }

    public bill(Customer customer) {
        this.customer = customer;
    }
}