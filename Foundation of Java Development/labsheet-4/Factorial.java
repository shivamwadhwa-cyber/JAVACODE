public class Factorial {
    static int totalCalls = 0;

    void calculate(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        totalCalls++;

        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.calculate(5);
        System.out.println("Total Calls: " + totalCalls);
    }
}