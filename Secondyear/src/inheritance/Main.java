package inheritance;

/*
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 12345, "2022-01-01", 10.0);
        
        // Accessing superclass methods
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Number: " + employee.getEmployeeNumber());
        System.out.println("Employee Hire Date: " + employee.getEmployeeHireDate());
        System.out.println("Hourly Pay Rate: $" + employee.getHourlyPayRate());
        System.out.println("Pay for 40 hours worked: $" + employee.getPay(40));

        System.out.println("-----------------------");

        // Create a ProductionWorker object
        ProductionWorker worker = new ProductionWorker("Jane Smith", 67890, "2022-03-15", 12.0, 2);
        
        // Accessing superclass and subclass methods
        System.out.println("Employee Name: " + worker.getEmployeeName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
       
    }}
public class Employee {
    private String employeeName;
    private int employeeNumber;
    private String employeeHireDate;
    private double hourlyPayRate;

    public Employee(String employeeName, int employeeNumber, String employeeHireDate, double hourlyPayRate) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.employeeHireDate = employeeHireDate;
        this.hourlyPayRate = hourlyPayRate;
    }

    // Getters and Setters
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeHireDate() {
        return employeeHireDate;
    }

    public void setEmployeeHireDate(String employeeHireDate) {
        this.employeeHireDate = employeeHireDate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    // Method to calculate pay
    public double getPay(int hoursWorked) {
        return hourlyPayRate * hoursWorked;
    }
}

public class ProductionWorker extends Employee {
    private int shift;

    public ProductionWorker(String employeeName, int employeeNumber, String employeeHireDate, double hourlyPayRate, int shift) {
        super(employeeName, employeeNumber, employeeHireDate, hourlyPayRate);
        this.shift = shift;
    }

    // Getter and Setter for shift
    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    // Override method to calculate pay based on shift
    @Override
    public double getPay(int hoursWorked) {
        if (shift == 2) {
            return super.getPay(hoursWorked) * 2; // Night shift workers get paid double
        } else {
            return super.getPay(hoursWorked); // Day shift workers get normal hourly rate
        }
    }
}      
*/
