package PoJos;

public class Employee {

    private String name;
    private String department;
    private double salary;
    private Car car;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.car = new Car(1, "Sedan", "Suzuki", "20000");
    }

    // Getters
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return name + " (" + department + ") - $" + salary;
    }
}
