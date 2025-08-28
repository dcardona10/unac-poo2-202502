package co.edu.unac.oop2.threads;

import co.edu.unac.oop2.nothreads.Client;
import co.edu.unac.oop2.nothreads.Item;

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

        long init = System.currentTimeMillis();

        CashierThread csh1 = new CashierThread("Carlos", cl1, init);
        CashierThread csh2 = new CashierThread("Jose", cl2, init);

        csh1.start();
        csh2.start();
    }
}
