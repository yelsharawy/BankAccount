public class BankAccount {

    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int accountID, String password) {
        this.balance = 0;
        this.accountID = accountID;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setPassword(String newPass) {
        password = newPass;
    }

    public boolean deposit(double amount) {
        if (amount < 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    public String toString() {
        return "#" + accountID + "\t" + "$" + balance;
    }

    private boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
        // one-liner:
        // return authenticate(password) && withdraw(amount) && other.deposit(amount);
        if (authenticate(password) && withdraw(amount)) {
            if (other.deposit(amount)) return true;
            throw new AssertionError(
                (deposit(amount) ?
                    "CRITICAL ERROR: TRANSFER FAILED, REFUND SUCCEEDED" :
                    "CRITICAL ERROR: TRANSFER FAILED, REFUND FAILED"
                    ) + "\nFROM:\t" + this + "\nTO:\t" + other);
        }
        return false;
    }

}
