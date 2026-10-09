import java.util.Scanner;

public class ThreeDArray {
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

        System.out.println("Elements of the 3D array:");
        for (int i = 0; i < layers; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}