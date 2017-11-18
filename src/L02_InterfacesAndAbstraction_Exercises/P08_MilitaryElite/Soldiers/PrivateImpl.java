package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.Soldiers;

import L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite.SoldierImpl;

public class PrivateImpl extends SoldierImpl implements Private {
    double salary;
    
    public PrivateImpl(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        setSalary(salary);
    }
    
    private void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double getSalary() {
        return this.salary;
    }
    
    @Override
    public String toString() {
        
        return super.toString() + String.format(" Salary: %.2f", this.salary);
    }
}
