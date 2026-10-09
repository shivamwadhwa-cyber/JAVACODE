import java.util.Scanner;

public class SearchElementThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of layers: ");
        int layers = sc.nextInt();

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][][] array3D = new int[layers][rows][cols];

        System.out.println("Enter the elements of the 3D array:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    array3D[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    if (array3D[i][j][k] == target) {
                        System.out.println("Element " + target + " found at layer " + (i + 1) + ", row " + (j + 1) + ", column " + (k + 1));
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the 3D array.");
        }

        sc.close();
    }
}
