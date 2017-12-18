package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models;

public class BaseEmployee implements Employee {

    private String name;
    private int salary;

    BaseEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getSalary();
    }
}
