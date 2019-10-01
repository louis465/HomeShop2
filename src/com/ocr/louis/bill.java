package com.ocr.louis;

        import java.util.HashMap;
        import java.util.Map;

public class bill {
    private Customer client;
    private Map<product, Integer> products = new HashMap<product, Integer>();
    private Delivery delivery;

    public bill(Customer client, Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }

    public void addProduct(product product, int quantity) {
        this.products.put(product, quantity);
    }

    public Customer getClient() {
        return client;
    }

    public Map<product, Integer> getProducts() {
        return products;
    }
}