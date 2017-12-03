package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.engine.Engine;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.entities.Interfaqces.Weapon;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io.ConsoleInputReader;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io.ConsoleOutputWriter;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io.InputReader;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io.OutputWriter;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.repositories.Repository;
import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.repositories.WeaponRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        Repository<Weapon> weaponRepository = new WeaponRepository<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputWriter writer = new ConsoleOutputWriter();
        InputReader br = new ConsoleInputReader(reader);
        Runnable engine = new Engine(weaponRepository, br, writer);
        engine.run();
    }
}
