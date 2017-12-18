package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.models.units;

@SuppressWarnings("unused")
public class Pikeman extends AbstractUnit {

	private static final int PIKEMAN_HEALTH = 30;
	private static final int PIKEMAN_DAMAGE = 15;

	public Pikeman() {
		super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
	}
}
