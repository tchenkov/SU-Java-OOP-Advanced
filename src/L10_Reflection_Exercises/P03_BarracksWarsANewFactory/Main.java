package L10_Reflection_Exercises.P03_BarracksWarsANewFactory;

import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Repository;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Runnable;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.UnitFactory;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core.Engine;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core.factories.UnitFactoryImpl;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
