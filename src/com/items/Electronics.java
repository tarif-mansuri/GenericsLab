package com.items;

public class Electronics extends Item {
    private int warranty;

    public Electronics(int id, String name, String price, String quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
