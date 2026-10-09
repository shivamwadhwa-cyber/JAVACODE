import java.util.Scanner;

public class JaggedArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.println("Enter the elements of row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Sort each row of the jagged array
        for (int i = 0; i < rows; i++) {
            java.util.Arrays.sort(jaggedArray[i]);
        }

        System.out.println("Sorted Jagged Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
