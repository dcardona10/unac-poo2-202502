package co.edu.unac.oop2.nothreads;

import java.util.List;

public class Client {

    private String name;
    private List<Item> items;

    public Client(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
