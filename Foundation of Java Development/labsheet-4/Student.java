public class Student {
    String name;
    int age;
    static int count = 0;

    void display() {
        String studentName = "Shivam";
        int studentAge = 20;

        name = studentName;
        age = studentAge;
        count++;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Students: " + count);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}