package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.factories;

import L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.enumerations.Gem;

public class GemFactory {
    public static Gem create(String gemType){
        try {
            return Gem.valueOf(gemType.toUpperCase());
        } catch (IllegalArgumentException iae) {
            return null;
        }
    }
}
