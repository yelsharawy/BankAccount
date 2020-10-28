public class Tester {

    public static void main(String[] args) {
        BankAccount testAccount = new BankAccount(420, "myPassword123");

        System.out.println(testAccount.deposit(20));  // 0 -> 20, output `true`
        System.out.println(testAccount.deposit(-10));  // output `false`

        System.out.println(testAccount.getBalance());  // 20
        System.out.println(testAccount.getAccountID());  // 420

        testAccount.setPassword("newPassword123");  // no visible change...
    }

}
