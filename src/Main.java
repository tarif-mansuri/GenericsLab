import com.inventory.Inventory;
import com.items.Book;
import com.items.Clothing;
import com.items.Electronics;
import com.items.Item;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Book("B1", "Java Generics", "1000", "3", "Tarif M"));
        items.add(new Clothing("C1", "T-Shirt", "1200", "2", "Medium"));
        items.add(new Electronics("E1", "Charger", "300", "5", 2));
        Collections.sort(items);
        for(Item item : items) {
            System.out.println(item);
        }
        System.out.println("Inventory unit testing starts here");

        Inventory<Item> inventory = new Inventory<>(new HashMap<String, Item>());
        inventory.addItem(new Book("B1", "Java Generics", "1000", "3", "Tarif M"));
        inventory.addItem(new Clothing("C1", "T-Shirt", "1200", "2", "Medium"));
        inventory.addItem(new Electronics("E1", "Charger", "300", "5", 2));

        System.out.println("Here are the inventory items");

        for(Item item : inventory.getItems()) {
            System.out.println(item);
        }
    }
}