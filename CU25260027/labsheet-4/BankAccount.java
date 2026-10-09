public class BankAccount {
    String accountNumber;
    double balance;
    static String bankName = "State Bank";

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank: " + bankName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = "123456789";
        b.balance = 5000;
        b.deposit(2000);
    }
}