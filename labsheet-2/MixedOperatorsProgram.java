import java.util.Scanner;

public class MixedOperatorsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean powerOf4 = number > 0
                && (number & (number - 1)) == 0
                && (number & 0x55555555) != 0;

        System.out.println("Is power of 4? " + powerOf4);

        int toggled = number ^ (1 << 2);

        System.out.println("After toggling 3rd bit = " + toggled);

        System.out.println("Multiplication table:");

        for (int i = 1; i <= 20; i++) {
            int result = number * i;

            if (result % 6 == 0) {
                continue;
            }

            if (result % 48 == 0) {
                break;
            }

            System.out.println(number + " x " + i + " = " + result);
        }

        sc.close();
    }
}