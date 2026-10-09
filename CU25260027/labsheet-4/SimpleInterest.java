public class SimpleInterest {
    double principal;
    double rate;
    double time;
    static String interestType = "Simple Interest";

    void display() {
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Interest Type: " + interestType);
        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.principal = 10000;
        si.rate = 5;
        si.time = 2;
        si.display();
    }
}
