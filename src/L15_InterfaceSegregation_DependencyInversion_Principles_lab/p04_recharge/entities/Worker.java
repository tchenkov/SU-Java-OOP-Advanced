package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p04_recharge.entities;


public abstract class Worker{

    private String id;
    private int workingHours;

    public Worker(String id) {
        this.id = id;
    }

    public void work(int hours) {
        this.workingHours += hours;
    }
}
