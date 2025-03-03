import java.text.NumberFormat;

public class Account implements Lockable {
    private final double RATE = 0.035; // interest rate of 3.5%

    private long acctNumber;
    private double balance;
    private String name;
    private int key;
    private boolean isLocked = false;

    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    @Override
    public void setKey(int key) {
        if (!locked()) {
            this.key = key;
        }
    }

    @Override
    public void lock(int key) {
        if (this.key == key && !locked()) {
            isLocked = true;
        }
    }

    @Override
    public void unlock(int key) {
        if (this.key == key && locked()) {
            isLocked = false;
        }
    }

    @Override
    public boolean locked() {
        return isLocked;
    }

    public double deposit(double amount) {
        if (locked())
            return balance;
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, double fee) {
        if (locked())
            return balance;
        balance -= (amount + fee);
        return balance;
    }

    public double addInterest() {
        if (locked())
            return balance;
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }
}
