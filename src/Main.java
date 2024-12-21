import com.items.Book;
import com.items.Clothing;
import com.items.Electronics;
import com.items.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Book(1, "Java Generics", "1000", "3", "Tarif M"));
        items.add(new Clothing(3, "T-Shirt", "1200", "2", "Medium"));
        items.add(new Electronics(4, "Charger", "300", "5", 2));
        Collections.sort(items);
        for(Item item : items) {
            System.out.println(item);
        }
    }
}