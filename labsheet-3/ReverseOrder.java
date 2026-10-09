import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The entered integers in reverse order are:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

            sc.close();
        }
    }
}