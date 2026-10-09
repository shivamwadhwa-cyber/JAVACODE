
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String s2 = sc.nextLine();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("Division = " + (a / b));

            System.out.print("Enter array index (0-4): ");
            String s3 = sc.nextLine();

            int index = Integer.parseInt(s3);
            System.out.println("Array element = " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            sc.close();
        }
    }
}