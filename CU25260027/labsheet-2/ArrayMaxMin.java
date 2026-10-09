import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }
        }

        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        sc.close();
    }
}