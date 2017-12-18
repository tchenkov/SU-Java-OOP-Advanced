package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.entities.workers.sleepers;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.entities.Worker;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.interfaces.Sleeper;

public class Employee extends Worker implements Sleeper {

    public Employee(String id) {
        super(id);
    }
    
    
    public void sleep() {
        // sleep...
    }

    public void recharge() {
        throw new UnsupportedOperationException("Employees cannot recharge");
    }
}
