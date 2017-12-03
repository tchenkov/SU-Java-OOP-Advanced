package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations.WeaponType;

public class Sword extends BaseWeapon {
    
    public Sword(String name) {
        super(name, WeaponType.SWORD.getMinDamage(), WeaponType.SWORD.getMaxDamage(), WeaponType.SWORD.getSocketsCount());
    }
}
