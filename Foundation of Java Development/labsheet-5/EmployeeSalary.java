public class EmployeeSalary {

    static class Employee {
        double salary;

        double calculateSalary() {
            return salary;
        }
    }

    static class Manager extends Employee {
        double bonus;

        @Override
        double calculateSalary() {
            return salary + bonus;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary = 50000;

        Manager m = new Manager();
        m.salary = 60000;
        m.bonus = 10000;

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}