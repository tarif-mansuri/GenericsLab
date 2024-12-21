package com.inventory;

import com.items.Item;

import java.util.Collection;
import java.util.HashMap;

public class Inventory<T extends Item> {

    private final HashMap<String, T> inventoryItems;
    public Inventory(HashMap<String, T> inventoryItems){
        this.inventoryItems = inventoryItems;
    }

    public void addItem(T item){
        inventoryItems.put(item.getId(), item);
    }

    public T getItem(String id){
        return inventoryItems.get(id);
    }

    public Collection<T> getItems(){
        return inventoryItems.values();
    }
}
