package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.interfaces.Target;
import rpg_lab.interfaces.Weapon;

public class WeaponTest {
    private static final int WEAPON_ATTACK = 10;
    private static final int WEAPON_DURABILITY = 10;
    private static final int TARGET_HEALTH = 10;
    private static final int TARGET_GIVE_EXPERIENCE = 10;
    private static final int EXPECTED_WEAPON_DURABILITY_AFTER_AN_ATTACK = WEAPON_DURABILITY - 1;
    private static final String WRONG_DURABILITY = "wrong durability ";
    
    private Weapon weapon;
    private Target target;
    
    @Before
    public void initializeTestObjects() {
        this.weapon = new Axe(WEAPON_ATTACK, WEAPON_DURABILITY);
        this.target = new Dummy(TARGET_HEALTH, TARGET_GIVE_EXPERIENCE);
    }
    
    @Test
    public void weaponAttacksLosesDurability() {
        this.weapon.attack(this.target);
        
        Assert.assertEquals(WRONG_DURABILITY, EXPECTED_WEAPON_DURABILITY_AFTER_AN_ATTACK, weapon.getDurabilityPoints());
    }
    
    @Test(expected = IllegalStateException.class)
    public void brokenWeaponCantAttack() {
        this.weapon.attack(this.target);
        this.weapon.attack(this.target);
    }
    
}