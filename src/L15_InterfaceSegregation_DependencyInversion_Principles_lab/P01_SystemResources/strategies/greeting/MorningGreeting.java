package L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.strategies.greeting;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.strategies.GreetingStrategy;

public class MorningGreeting implements GreetingStrategy {
    
    @Override
    public String getGreeting() {
        return "morning";
    }
}
