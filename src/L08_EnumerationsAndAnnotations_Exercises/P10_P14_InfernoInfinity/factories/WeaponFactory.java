package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.factories;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations.Axe;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations.BaseWeapon;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations.Knife;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Implementations.Sword;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WeaponFactory {
    private final static String WEAPONS_PATH = getWeaponsPath();
    
    private WeaponFactory() {
    }
    
    public static Weapon create(String weaponType, String weaponName) {
        weaponType = weaponType.toUpperCase().charAt(0) + weaponType.toLowerCase().substring(1);
        try {
            Class<?> weaponClass = Class.forName(WEAPONS_PATH + weaponType);
            Constructor constructor = weaponClass.getConstructor(String.class);
            return  (Weapon) constructor.newInstance(weaponName);
        }
        catch (
                ClassNotFoundException |
                NoSuchMethodException |
                IllegalAccessException |
                InstantiationException |
                InvocationTargetException e) {
            return null;
        }
    }
    
    
    
    private static String getWeaponsPath() {
        return BaseWeapon.class.getCanonicalName().replace(BaseWeapon.class.getSimpleName(), "");
    }
    
    public static Weapon createAxe(String name) {
        return new Axe(name);
    }
    
    public static Weapon createKnife(String name) {
        return new Knife(name);
    }
    
    public static Weapon createSword(String name) {
        return new Sword(name);
    }
}
