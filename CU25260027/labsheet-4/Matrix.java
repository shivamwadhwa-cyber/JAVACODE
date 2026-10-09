public class Matrix {
    int[][] matrix = new int[2][2];
    static String matrixType = "2x2 Matrix";

    void add(int[][] a, int[][] b) {
        int[][] result = new int[2][2];

        System.out.println("Matrix Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    void subtract(int[][] a, int[][] b) {
        int[][] result = new int[2][2];

        System.out.println("Matrix Subtraction:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] - b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        m.add(a, b);
        m.subtract(a, b);
    }
}