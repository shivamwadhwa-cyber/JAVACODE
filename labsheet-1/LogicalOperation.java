import java.util.Scanner;

public class LogicalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (A for AND, O for OR): ");
        char op = sc.next().charAt(0);

        boolean result;

        if (op == 'A' || op == 'a') {
            result = (a > 0) && (b > 0);
            System.out.println("Result = " + result);
        } else if (op == 'O' || op == 'o') {
            result = (a > 0) || (b > 0);
            System.out.println("Result = " + result);
        } else {
            System.out.println("Invalid Logical Operator");
        }

        sc.close();
    }
}
