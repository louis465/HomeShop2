package com.ocr.louis;

public class Customer {
    private String fullname;
    private String address;

    public Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }
    public String getFullname() {
        return fullname;
    }

      String getAddress() {
        return address;
    }
}
