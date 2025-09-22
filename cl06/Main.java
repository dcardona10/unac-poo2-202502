public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        Thread client1 = new Thread(new Client(account, "Juan"));
        Thread client2 = new Thread(new Client(account, "Jose"));

        client1.start();
        client2.start();
    }
}
