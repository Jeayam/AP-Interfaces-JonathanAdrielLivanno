package interfaces;

public abstract class Employee implements Payable {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() { return name; }
    
}