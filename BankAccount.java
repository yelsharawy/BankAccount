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

}
