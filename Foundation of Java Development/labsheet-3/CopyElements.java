import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sourceArray = new int[5];
        int[] destinationArray = new int[5];

        System.out.println("Enter 5 integers for the source array:");
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = sc.nextInt();
        }

        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("The elements in the destination array are:");
        for (int num : destinationArray) {
            System.out.print(num + " ");

            sc.close();
        }
    }
}
