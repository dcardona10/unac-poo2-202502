public class Client implements Runnable {

    private BankAccount account;
    private String name;

    public Client(BankAccount account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(30, this.name);
        }
    }
}
