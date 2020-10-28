public class Tester {

    public static void main(String[] args) {
        BankAccount testAccount = new BankAccount(420, "myPassword123");

        System.out.println(testAccount.getBalance());   // 0.0

        System.out.println(testAccount.deposit(20));    // 0.0 -> 20.0, `true`
        System.out.println(testAccount.deposit(-10));   // `false`

        System.out.println(testAccount.getBalance());   // 20.0
        System.out.println(testAccount);    // 420  20.0

        System.out.println(testAccount.withdraw(10));   // 20.0 -> 10.0, `true`
        System.out.println(testAccount.withdraw(-10));  // `false`
        System.out.println(testAccount.withdraw(10));   // 10.0 -> 0.0, `true`
        System.out.println(testAccount.withdraw(10));   // `false`

        System.out.println(testAccount.getBalance());   // 0.0

        System.out.println(testAccount.getAccountID()); // 420

        testAccount.setPassword("newPassword123"); // no visible change...

        System.out.println(testAccount);    // #420     $0.0

        BankAccount secondAccount = new BankAccount(1337, "otherPassword13");

        testAccount.deposit(1000);
        System.out.println(testAccount.transferTo(secondAccount, 600, "newPassword123"));  // true
        System.out.println(testAccount);    // #420     $400.0
        System.out.println(secondAccount);  // #1337    $600.0
    }

}
