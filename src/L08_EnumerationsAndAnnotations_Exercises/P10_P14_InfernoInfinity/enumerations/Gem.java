package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations;

public enum Gem {
    RUBY(7, 2, 5),
    EMERALD(1, 4, 9),
    AMETHYST(2, 8, 4);
    
    private int strength;
    private int agility;
    private int vitality;
    
    Gem(int strength, int agility, int vitality) {
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
    }
    
    public int getStrength() {
        return this.strength;
    }
    
    public int getAgility() {
        return this.agility;
    }
    
    public int getVitality() {
        return this.vitality;
    }
}
