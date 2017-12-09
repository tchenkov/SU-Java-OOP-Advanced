package rpg_lab.interfaces;

public interface Weapon {
    int getAttackPoints();
    
    int getDurabilityPoints();
    
    void attack(Target target);
}
