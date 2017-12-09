package rpg_lab;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.interfaces.Target;
import rpg_lab.interfaces.Weapon;

public class HeroTest {
    private static final int TARGET_GIVE_XP = 5;
    private static final String HERO_NAME = "Evlogi";
    private static final String WRONG_EXPERIENCE = "Wrong experience";
    
    @Test
    public void attackGainExperienceIfTargetIsDead() {
        Target fakeTarget = Mockito.mock(Target.class);
        Mockito.when(fakeTarget.isDead()).thenReturn(true);
        Mockito.when(fakeTarget.giveExperience()).thenReturn(TARGET_GIVE_XP);
        
        Weapon fakeWeapon = Mockito.mock(Weapon.class);
        
        Hero hero = new Hero(HERO_NAME, fakeWeapon);
        
        hero.attack(fakeTarget);
    
        Assert.assertEquals(WRONG_EXPERIENCE, TARGET_GIVE_XP, hero.getExperience());
    }
    
}