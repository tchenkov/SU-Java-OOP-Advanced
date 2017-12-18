package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core.factories;

import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Unit;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.UnitFactory;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.models.units.AbstractUnit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			//"L10_Reflection_Exercises.P03_BarracksWarsANewFactory.models.units.";
			AbstractUnit.class.getCanonicalName().replace(AbstractUnit.class.getSimpleName(), "");

	@Override
	public Unit createUnit(String unitType) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<?> unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
		Constructor<?> unitConstructor = unitClass.getDeclaredConstructor();
		@SuppressWarnings("UnnecessaryLocalVariable")
        Unit unit = (Unit) unitConstructor.newInstance();
		
		return unit;
	}
}
