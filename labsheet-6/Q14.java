
import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    public InvalidExamMarksException(String message) {
        super(message);
    }
}

public class Q14 {

    static void evaluateMarks(int marks)
            throws InvalidExamMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidExamMarksException(
                "Marks must be between 0 and 100."
            );
        }

        if (marks >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student's marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            evaluateMarks(marks);

        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric marks.");
        } finally {
            System.out.println("Exam evaluation completed.");
            sc.close();
        }
    }
}
