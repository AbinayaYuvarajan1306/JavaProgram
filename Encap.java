class bankaccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class Encap {
    public static void main(String[] a) {
        bankaccount account = new bankaccount();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(100000);
        System.out.println("Balance: " + account.getBalance());
    }
}