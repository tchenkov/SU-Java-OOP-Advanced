package L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.GreetingClock;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.implementations.ConsoleWriter;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.implementations.TimeProviderImpl;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.interfaces.TimeProvider;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.interfaces.Writer;

public class Main {
    public static void main(String[] args) {
        TimeProvider timeProvider = new TimeProviderImpl();
        Writer writer = new ConsoleWriter();
        GreetingClock greetingClock = new GreetingClock(timeProvider, writer);
        
        greetingClock.greeting();
    }
}
