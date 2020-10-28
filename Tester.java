public class Tester {

    public static void main(String[] args) {
        BankAccount testAccount = new BankAccount(420, "myPassword123");
        System.out.println(testAccount.getBalance());
        System.out.println(testAccount.getAccountID());
    }

}
