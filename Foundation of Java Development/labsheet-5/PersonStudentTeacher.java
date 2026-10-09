public class PersonStudentTeacher {

    static class Person {
        String name;

        void displayName() {
            System.out.println("Name: " + name);
        }
    }

    static class Student extends Person {
        String course;

        void study() {
            System.out.println(name + " is studying " + course);
        }
    }

    static class Teacher extends Person {
        String subject;

        void teach() {
            System.out.println(name + " teaches " + subject);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shivam";
        s.course = "BCA";

        Teacher t = new Teacher();
        t.name = "Mr. Sharma";
        t.subject = "Java";

        s.displayName();
        s.study();

        t.displayName();
        t.teach();
    }
}