
import java.util.Scanner;

class InvalidDosageException extends Exception {
    public InvalidDosageException(String message) {
        super(message);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drugName = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            int dosage = Integer.parseInt(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException(
                    "Dosage must be between 1 and 1000 mg."
                );
            }

            System.out.println("Dosage is valid.");
            System.out.println("Patient name: " + patientName);
            System.out.println("Drug name: " + drugName);
            System.out.println("Dosage: " + dosage + " mg");

        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a valid numeric dosage.");
        } finally {
            System.out.println("Dosage validation completed.");
            sc.close();
        }
    }
}