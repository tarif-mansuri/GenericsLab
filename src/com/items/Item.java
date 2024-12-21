package com.items;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private String price;
    private String quantity;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Item(String id, String name, String price, String quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.price + " " + this.quantity;
    }
}
