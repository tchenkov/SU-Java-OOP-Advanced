package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.core;

import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.CommandInterpreter;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Repository;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.Runnable;
import L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("unused")
public class Engine implements Runnable {

	private Repository repository;
	private UnitFactory unitFactory;
	private CommandInterpreter interpreter;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpretCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | InstantiationException | ClassNotFoundException |
					IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpretCommand(String[] data, String commandName) throws ClassNotFoundException,
			NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String result;
		switch (commandName) {
			case "add":
				//result = this.addUnitCommand(data);
				break;
			case "report":
				//result = this.reportCommand(data);
				break;
			case "fight":
				//result = this.fightCommand(data);
				break;
			default:
				throw new RuntimeException("Invalid command!");
		}
		return null;
		//return result;
	}

//	private String reportCommand(String[] data) {
//		@SuppressWarnings("UnnecessaryLocalVariable")
//		String output = this.repository.getStatistics();
//		return output;
//	}

//	private String addUnitCommand(String[] data) throws ClassNotFoundException, NoSuchMethodException,
//			InvocationTargetException, InstantiationException, IllegalAccessException {
//		String unitType = data[1];
//		Unit unitToAdd = this.unitFactory.createUnit(unitType);
//		this.repository.addUnit(unitToAdd);
//        @SuppressWarnings("UnnecessaryLocalVariable")
//        String output = unitType + " added!";
//		return output;
//	}
	
//	private String fightCommand(String[] data) {
//		return "fight";
//	}
}
