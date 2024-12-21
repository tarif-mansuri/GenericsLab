package com.items;

public class Book extends Item {
    private String author;

    public Book(String id, String name, String price, String quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
