import java.util.Scanner;

public class ShiftMultiplicationDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int multiplication = number << power;
        int division = number >> power;

        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

        sc.close();
    }
}