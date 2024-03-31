public class DevOpsEngineer extends emp {
    private double bonus;

    public DevOpsEngineer(String name, int empId, double salary, double bonus) {
        super(name, empId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        double totalSalary = salary + bonus; // Accessing salary directly
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        // Creating an instance of DevOpsEngineer
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("John Doe", 1, 60000, 5000);
        devOpsEngineer.displayEmployeeDetails();
    }
}
