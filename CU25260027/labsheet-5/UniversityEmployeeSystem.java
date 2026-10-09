public class UniversityEmployeeSystem {

    interface Researcher {
        void conductResearch();
    }

    static class Employee {
        private int employeeId;
        private String employeeName;
        private double salary;

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public double getSalary() {
            return salary;
        }

        void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Salary: " + salary);
        }

        double calculateSalary() {
            return salary;
        }
    }

    static class Teacher extends Employee implements Researcher {
        String subject;

        void teach() {
            System.out.println("Teaching Subject: " + subject);
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Subject: " + subject);
        }

        @Override
        double calculateSalary() {
            return getSalary() + 5000;
        }

        @Override
        public void conductResearch() {
            System.out.println("Teacher is conducting research");
        }
    }

    static class VisitingTeacher extends Teacher {
        int hoursWorked;

        @Override
        double calculateSalary() {
            return hoursWorked * 500;
        }
    }

    static class Admin extends Employee {
        String department;

        void manageDepartment() {
            System.out.println("Managing Department: " + department);
        }
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setEmployeeId(101);
        teacher.setEmployeeName("Shivam");
        teacher.setSalary(50000);
        teacher.subject = "Java";

        teacher.displayDetails();
        teacher.teach();
        teacher.conductResearch();
        System.out.println("Teacher Salary: " + teacher.calculateSalary());

        VisitingTeacher visitingTeacher = new VisitingTeacher();
        visitingTeacher.setEmployeeId(102);
        visitingTeacher.setEmployeeName("Rahul");
        visitingTeacher.setSalary(0);
        visitingTeacher.hoursWorked = 40;

        System.out.println("\nVisiting Teacher: " + visitingTeacher.getEmployeeName());
        System.out.println("Salary: " + visitingTeacher.calculateSalary());

        Admin admin = new Admin();
        admin.setEmployeeId(103);
        admin.setEmployeeName("Amit");
        admin.setSalary(45000);
        admin.department = "Administration";

        System.out.println("\nAdmin Details:");
        admin.displayDetails();
        admin.manageDepartment();
    }
}