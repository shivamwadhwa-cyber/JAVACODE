import java.util.Scanner;

public class CountPositiveNegativeThreeDArray {
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
        for (int l = 0; l < layers; l++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array3D[l][i][j] = sc.nextInt();
                }
            }
        }

        int positiveCount = 0;
        int negativeCount = 0;

        for (int l = 0; l < layers; l++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (array3D[l][i][j] > 0) {
                        positiveCount++;
                    } else if (array3D[l][i][j] < 0) {
                        negativeCount++;
                    }
                }
            }
        }

        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Number of negative elements: " + negativeCount);

        sc.close();
    }
}