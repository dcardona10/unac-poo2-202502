package co.edu.unac.oop2.threads;

import co.edu.unac.oop2.nothreads.Client;
import co.edu.unac.oop2.nothreads.Item;

public class CashierThread extends Thread {

    private String name;
    private Client client;
    private long timestamp;

    public CashierThread(String name, Client client, long timestamp) {
        this.name = name;
        this.client = client;
        this.timestamp = timestamp;
    }

    public void run() {

        System.out.println("Cashier " + this.name + " starts processing purchase of Client: " + this.client.getName() + " - " + (System.currentTimeMillis() - timestamp) / 1000 + "s.");
        for (Item item : this.client.getItems()) {
            this.waitNSecs(item.getSecs());
            System.out.println("Processing Item: " + item.getName() + " - " + (System.currentTimeMillis() - timestamp) / 1000 + "s.");
        }
        System.out.println("Cashier " + this.name + " finishes processing purchase of Client: " + this.client.getName() + " - " + (System.currentTimeMillis() - timestamp) / 1000 + "s.");
    }

    private void waitNSecs(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
