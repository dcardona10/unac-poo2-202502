public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount, String client) {

        if (this.balance >= amount) {
            System.out.println("Client " + client + " withdrawing $" + amount + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.balance -= amount;
            System.out.println("Client " + client + " finished withdrawal");
        } else {
            System.out.println("Client " + client + ": Operation failed - insufficient balance. Withdrawal cannot be executed.");
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
