public class BankAccount1 {
    double balance;
    static String bankCode = "ABC123";

    void withdraw(double amount) {
        double withdrawal = amount;

        if (withdrawal <= balance) {
            balance = balance - withdrawal;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Bank Code: " + bankCode);
    }

    public static void main(String[] args) {
        BankAccount1 b = new BankAccount1();
        b.balance = 10000;
        b.withdraw(3000);
    }
}