public class Employee {
    String name;
    int age;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.age = 30;
        emp.salary = 50000.0;
        emp.display();
    }
}
