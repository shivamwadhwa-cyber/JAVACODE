
import java.util.Scanner;

public class StringLexicographicOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if (str1.compareTo(str2) < 0) {
            System.out.println("The first string comes before the second string in lexicographic order.");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("The first string comes after the second string in lexicographic order.");
        } else {
            System.out.println("The two strings are equal.");
        }

        sc.close();
    }
}
