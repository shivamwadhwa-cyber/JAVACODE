public class Armstrong {
    static int totalChecks = 0;

    void check(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.check(153);
        System.out.println("Total Checks: " + totalChecks);
    }
}