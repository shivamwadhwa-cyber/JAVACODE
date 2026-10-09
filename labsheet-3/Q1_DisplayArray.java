import java.util.Scanner;

public class Q1_DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The entered integers are:");
        for (int num : array) {
            System.out.print(num + " ");

            sc.close();
        }
    }
}