package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.models.units;

import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.models.units.AbstractUnit;

public class Swordsman extends AbstractUnit {
    private static final int SWORDSMAN_HEALTH = 40;
    private static final int SWORDSMAN_DAMAGE = 13;

    public Swordsman() {
        super(SWORDSMAN_HEALTH, SWORDSMAN_DAMAGE);
    }
}
