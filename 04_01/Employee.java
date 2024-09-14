class Employee extends Person {
    int employeeId;
    double salary;

    // Constructor for Employee class
    public Employee(String name, int age, int employeeId, double salary) {
        // Using super() to call the superclass constructor
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        // Calling superclass method
        displayPersonDetails();
        System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
    }
}

