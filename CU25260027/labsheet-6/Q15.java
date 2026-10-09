
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    public InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                    "Quantities cannot be negative."
                );
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                    "Required quantity exceeds available stock."
                );
            }

            available = available - required;

            System.out.println("Medicine issued successfully.");
            System.out.println("Medicine name: " + medicineName);
            System.out.println("Quantity issued: " + required);
            System.out.println("Remaining stock: " + available);

        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric quantities.");
        } finally {
            System.out.println(
                "Inventory transaction completed."
            );
            sc.close();
        }
    }
}
