import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        int digit1 = num % 10;
        sum = sum + digit1 * digit1 * digit1;
        num = num / 10;

        int digit2 = num % 10;
        sum = sum + digit2 * digit2 * digit2;
        num = num / 10;

        int digit3 = num % 10;
        sum = sum + digit3 * digit3 * digit3;

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        sc.close();
    }
}
