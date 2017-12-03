package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.annotations.CustomAnnotation;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations.Gem;

@CustomAnnotation
public abstract class BaseWeapon implements Weapon, Comparable<Weapon> {
    private String name;
    private int minDamage;
    private int maxDamage;
    private int socketsCount;
    private Gem[] sockets;
    private int strength;
    private int agility;
    private int vitality;
    
    protected BaseWeapon(String name, int minDamage, int maxDamage, int socketsCount) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.socketsCount = socketsCount;
        this.sockets = new Gem[socketsCount];
        this.strength = 0;
        this.agility = 0;
        this.vitality = 0;
    }
    
    @Override
    public double getItemLevel(){
        return ((this.minDamage + this.maxDamage)/ 2.0) + this.strength + this.agility + this.vitality;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public void addGem(int index, Gem gem) {
        if (0 <= index && index < this.socketsCount && gem != null) {
            if (this.sockets[index] != null){
                this.removeGem(index);
            }
            this.sockets[index] = gem;
            this.strength += gem.getStrength();
            this.agility += gem.getAgility();
            this.vitality += gem.getVitality();
            this.minDamage += gem.getStrength() * 2 + gem.getAgility();
            this.maxDamage += gem.getStrength() * 3 + gem.getAgility() * 4;
        }
    }
    
    @Override
    public void removeGem(int index) {
        if (0 <= index && index < this.socketsCount) {
            Gem gem = this.sockets[index];
            if (gem != null) {
                this.strength -= gem.getStrength();
                this.agility -= gem.getAgility();
                this.vitality -= gem.getVitality();
                this.minDamage -= gem.getStrength() * 2 + gem.getAgility();
                this.maxDamage -= gem.getStrength() * 3 + gem.getAgility() * 4;
                this.sockets[index] = null;
            }
        }
    }
    
    @Override
    public int compareTo(Weapon weapon) {
        return Double.compare(this.getItemLevel(), weapon.getItemLevel());
    }
    
    @Override
    public String print() {
        return this.toString() + String.format(" (Item Level: %.1f)", this.getItemLevel());
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.name,
                this.minDamage,
                this.maxDamage,
                this.strength,
                this.agility,
                this.vitality
        );
    }
}
