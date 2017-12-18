package L10_Reflection_Exercises.P03_BarracksWarsANewFactory.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
