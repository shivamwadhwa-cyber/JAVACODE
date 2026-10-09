class Employee {
    private String name;
    private int employeeId;

    void setName(String name) {
        this.name = name;
    }

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

public class Developer extends Employee
        implements Programmer, Researcher {

    @Override
    public void writeCode() {
        System.out.println("Developer is writing code");
    }

    @Override
    public void conductResearch() {
        System.out.println("Developer is conducting research");
    }

    public static void main(String[] args) {
        Developer d = new Developer();

        d.setName("Shivam");
        d.setEmployeeId(101);

        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}