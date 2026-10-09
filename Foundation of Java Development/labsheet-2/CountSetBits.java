import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        while (number != 0) {
            count = count + (number & 1);
            number = number >>> 1;
        }

        System.out.println("Number of set bits = " + count);

        sc.close();
    }
}