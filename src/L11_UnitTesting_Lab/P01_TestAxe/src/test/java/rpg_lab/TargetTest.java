package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.interfaces.Target;
import rpg_lab.interfaces.Weapon;

public class TargetTest {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_GIVE_EXPERIENCE = 10;
    private static final int EXPECTED_TARGET_HEALTH_AFTER_AN_ATTACK = 0;
    private static final int EXPECTED_EXPERIENCE_GAIN = 10;
    private static final String HERO_NAME = "Evlogi";
    private static final String TARGET_DOES_NOT_LOSE_EXPECTED_AMOUNT_OF_HEALTH = "target does not lose expected amount of health";
    private static final String DEAD_TARGET_DOES_NOT_GIVE_EXPECTED_AMOUNT_OF_EXPERIENCE = "dead target does not give expected amount of experience";
    
    private Weapon weapon;
    private Target target;
    private Hero hero;
    
    @Before
    public void initializeTestObjects() {
        this.weapon = new Axe(AXE_ATTACK, AXE_DURABILITY);
        this.target = new Dummy(DUMMY_HEALTH, DUMMY_GIVE_EXPERIENCE);
        this.hero = new Hero(HERO_NAME, this.weapon);
    }
    
    @Test
    public void targetLosesHealthIfAttacked() {
        this.hero.attack(this.target);
    
        Assert.assertEquals(TARGET_DOES_NOT_LOSE_EXPECTED_AMOUNT_OF_HEALTH, EXPECTED_TARGET_HEALTH_AFTER_AN_ATTACK, this.target.getHealth());
    }
    
    @Test (expected = IllegalStateException.class)
    public void deadTargetThrowsExceptionIfAttacked() {
        this.hero.attack(this.target);
        this.hero.attack(this.target);
    }
    
    @Test
    public void deadDummyCanGiveXp() {
        this.hero.attack(this.target);
        
        Assert.assertEquals(DEAD_TARGET_DOES_NOT_GIVE_EXPECTED_AMOUNT_OF_EXPERIENCE, EXPECTED_EXPERIENCE_GAIN, hero.getExperience());
    }
}