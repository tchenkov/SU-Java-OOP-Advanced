package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.adapter;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.entities.workers.rechargablies.Robot;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.interfaces.Rechargeable;

public class RobotAdapter extends Robot implements Rechargeable{
    public RobotAdapter(String id, int capacity) {
        super(id, capacity);
    }
    
    @Override
    public void recharge() {
        super.setCurrentPower(super.getCapacity());
    }
}
