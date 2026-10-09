import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= -9 && num <= 9)
            System.out.println("Number of digits = 1");
        else if (num >= -99 && num <= 99)
            System.out.println("Number of digits = 2");
        else if (num >= -999 && num <= 999)
            System.out.println("Number of digits = 3");
        else if (num >= -9999 && num <= 9999)
            System.out.println("Number of digits = 4");
        else
            System.out.println("Number has 5 or more digits");

        sc.close();
    }
}