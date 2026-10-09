public class StudentGrade {
    String studentName;
    double grade;
    static String schoolName = "ABC High School";

    void display() {
        String name = studentName;
        double studentGrade = grade;

        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + studentGrade);
        System.out.println("School Name: " + schoolName);
    }

    public static void main(String[] args) {
        StudentGrade sg = new StudentGrade();
        sg.studentName = "John Doe";
        sg.grade = 85.5;
        sg.display();
    }
}
