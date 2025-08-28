package co.edu.unac.oop2.nothreads;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Item> items1 = new ArrayList<Item>();
        items1.add(new Item("TV", 5));
        items1.add(new Item("Laptop", 7));
        items1.add(new Item("Headphones", 3));
        Client cl1 = new Client("Juan", items1);

        List<Item> items2 = new ArrayList<Item>();
        items2.add(new Item("Laptop", 7));
        items2.add(new Item("Power Bank", 2));
        items2.add(new Item("Tablet", 5));
        items2.add(new Item("Wireless Earphones", 4));
        Client cl2 = new Client("Andres", items2);

        Cashier csh1 = new Cashier("Carlos");
        Cashier csh2 = new Cashier("Jose");

        long init = System.currentTimeMillis();

        csh1.processPurchase(cl1, init);
        csh2.processPurchase(cl2, init);
    }
}
