import java.util.Scanner;

public class RainfallTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rainfall for Monday: ");
        double monday = sc.nextDouble();

        System.out.print("Enter rainfall for Tuesday: ");
        double tuesday = sc.nextDouble();

        System.out.print("Enter rainfall for Wednesday: ");
        double wednesday = sc.nextDouble();

        double total = monday + tuesday + wednesday;

        System.out.println("Total rainfall = " + total);

        sc.close();
    }
}
