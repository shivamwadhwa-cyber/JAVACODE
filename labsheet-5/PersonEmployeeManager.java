public class PersonEmployeeManager {

    static class Person {
        String name;

        void displayName() {
            System.out.println("Name: " + name);
        }
    }

    static class Employee extends Person {
        int employeeId;

        void displayEmployee() {
            displayName();
            System.out.println("Employee ID: " + employeeId);
        }
    }

    static class Manager extends Employee {
        String department;

        void displayManager() {
            displayEmployee();
            System.out.println("Department: " + department);
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Shivam";
        m.employeeId = 101;
        m.department = "IT";

        m.displayManager();
    }
}