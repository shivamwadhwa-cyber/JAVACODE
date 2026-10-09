public class StudentMarks {
    int marks1, marks2, marks3;
    static String universityName = "COER University";

    void average() {
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.marks1 = 80;
        s.marks2 = 75;
        s.marks3 = 90;
        s.average();
    }
}