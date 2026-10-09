import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to rotate: ");
        int positions = sc.nextInt();

        // Normalize positions in case it's greater than size
        positions = positions % size;

        // Rotate the array
        int[] rotatedArray = new int[size];
        for (int i = 0; i < size; i++) {
            rotatedArray[(i + positions) % size] = array[i];
        }

        System.out.println("Rotated array:");
        for (int i = 0; i < size; i++) {
            System.out.print(rotatedArray[i] + " ");
        }

        sc.close();
    }
}
