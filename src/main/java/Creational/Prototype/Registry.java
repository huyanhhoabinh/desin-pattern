package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return item;
    }

    public void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("test");
        movie.setPrice(2.4);
        movie.setRuntime("2 hours");
        System.out.println(movie);
        items.put("movie", movie);
        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("test");
        System.out.println(book);
        items.put("book", book);
    }
}
