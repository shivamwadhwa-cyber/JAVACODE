import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = sc.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        sc.close();
    }
}
