public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0 && salary <= 1000000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmployeeId(101);
        e.setEmployeeName("Shivam");

        e.setSalary(50000);
        e.displayDetails();

        e.setSalary(-5000);
        e.setSalary(1500000);
    }
}