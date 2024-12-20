package com.items;

public class Clothing extends Item {
    private String size;

    public Clothing(int id, String name, String price, String quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}