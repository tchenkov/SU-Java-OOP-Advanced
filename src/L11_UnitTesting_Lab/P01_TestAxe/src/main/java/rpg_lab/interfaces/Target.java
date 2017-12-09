package rpg_lab.interfaces;

public interface Target {
    public int getHealth();
    
    public void takeAttack(int attackPoints);
    
    public int giveExperience();
    
    public boolean isDead();
}
