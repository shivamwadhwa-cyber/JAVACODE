import java.util.Scanner;

public class FactorsUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int i = 1;

        System.out.println("Factors are:");

        do {
            if (number % i == 0) {
                System.out.print(i + " ");
            }

            i++;
        } while (i <= number);

        sc.close();
    }
}
