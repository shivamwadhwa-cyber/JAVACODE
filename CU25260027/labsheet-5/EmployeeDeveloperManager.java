public class EmployeeDeveloperManager {

    static class Employee {
        String employeeName;
        int employeeId;

        void displayEmployee() {
            System.out.println("Name: " + employeeName);
            System.out.println("Employee ID: " + employeeId);
        }
    }

    static class Developer extends Employee {
        String programmingLanguage;

        void writeCode() {
            System.out.println("Programming Language: " + programmingLanguage);
        }
    }

    static class Manager extends Employee {
        String department;

        void conductMeeting() {
            System.out.println("Department: " + department);
        }
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Shivam";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.employeeName = "Rahul";
        m.employeeId = 102;
        m.department = "IT";

        d.displayEmployee();
        d.writeCode();

        m.displayEmployee();
        m.conductMeeting();
    }
}