import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        System.out.println("The sum of the entered integers is: " + sum);

        sc.close();
    }
}
