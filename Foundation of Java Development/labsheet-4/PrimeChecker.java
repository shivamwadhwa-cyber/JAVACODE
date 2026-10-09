public class PrimeChecker {
    int number;
    static String type = "Prime Number";

    void display() {
        String primeNumber = Integer.toString(number);

        System.out.println("Number: " + primeNumber);
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        PrimeChecker pc = new PrimeChecker();
        pc.number = 7;
        pc.display();
    }
}