package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.entities.workers.rechargablies;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.entities.Worker;

public class Robot extends Worker {

    private int capacity;
    private int currentPower;

    public Robot(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }
    
    @Override
    public void work(int hours) {
        if (hours > this.currentPower) {
            hours = currentPower;
        }

        super.work(hours);
        this.currentPower -= hours;
    }
    
    protected int getCapacity() {
        return this.capacity;
    }
    
    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }
}
