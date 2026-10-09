public class Employee1 {
    String name;
    int age;
    static String company = "TechCorp";

    void display() {
        String employeeName = name;
        int employeeAge = age;

        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.name = "Alice";
        e.age = 30;
        e.display();
    }
}