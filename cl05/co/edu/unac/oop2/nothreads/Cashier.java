package co.edu.unac.oop2.nothreads;

public class Cashier {

    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void processPurchase(Client client, long timestamp) {

        System.out.println("Cashier " + this.name + " starts processing purchase of Client: " + client.getName() + " - " + (System.currentTimeMillis() - timestamp) / 1000 + "s.");
        for (Item item : client.getItems()) {
            this.waitNSecs(item.getSecs());
            System.out.println("Processing Item: " + item.getName() + " - " + (System.currentTimeMillis() - timestamp) / 1000 + "s.");
        }
        System.out.println("Cashier " + this.name + " finishes processing purchase of Client: " + client.getName() + " - " + (System.currentTimeMillis() - timestamp) / 1000 + "s.");
    }

    private void waitNSecs(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
