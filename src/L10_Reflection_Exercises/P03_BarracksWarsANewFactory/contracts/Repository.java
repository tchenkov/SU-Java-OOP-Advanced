package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
