package L10_Reflection_Exercises.P01_HarvestingFields;

import L10_Reflection_Exercises.P01_HarvestingFields.engine.Engine;
import L10_Reflection_Exercises.P01_HarvestingFields.io.ConsoleInputReader;
import L10_Reflection_Exercises.P01_HarvestingFields.io.ConsoleOutputWriter;
import L10_Reflection_Exercises.P01_HarvestingFields.io.InputReader;
import L10_Reflection_Exercises.P01_HarvestingFields.io.OutputWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputReader br = new ConsoleInputReader(reader);
        OutputWriter writer = new ConsoleOutputWriter();
        Runnable engine = new Engine(br, writer);
        engine.run();
    }
}
