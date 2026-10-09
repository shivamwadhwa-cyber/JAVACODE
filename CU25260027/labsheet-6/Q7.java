
import java.util.Scanner;

public class Q7 {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception(
                "Age must be 18 or above."
            );
        }

        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}