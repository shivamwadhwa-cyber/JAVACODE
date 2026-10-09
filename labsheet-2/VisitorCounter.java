import java.util.Scanner;

public class VisitorCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Initial visitors = " + visitors);
        System.out.println("Visitor entering = " + (++visitors));
        System.out.println("Visitor leaving = " + (visitors--));
        System.out.println("Visitors remaining = " + visitors);

        sc.close();
    }
}