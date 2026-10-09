import java.util.Scanner;

public class ElementAppearsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int elementToSearch = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToSearch) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + elementToSearch + " appears in the array.");
        } else {
            System.out.println("Element " + elementToSearch + " does not appear in the array.");
        }

        sc.close();
    }
}