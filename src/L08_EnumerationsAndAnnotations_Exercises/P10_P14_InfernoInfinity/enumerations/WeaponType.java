package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations;

public enum WeaponType {
    AXE(5, 10, 4),
    KNIFE(3, 4, 2),
    SWORD(4, 6, 3);
    
    private int minDamage;
    private int maxDamage;
    private int socketsCount;
    
    WeaponType(int minDamage, int maxDamage, int socketsCount) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.socketsCount = socketsCount;
    }
    
    public int getMinDamage() {
        return this.minDamage;
    }
    
    public int getMaxDamage() {
        return this.maxDamage;
    }
    
    public int getSocketsCount() {
        return this.socketsCount;
    }
}
