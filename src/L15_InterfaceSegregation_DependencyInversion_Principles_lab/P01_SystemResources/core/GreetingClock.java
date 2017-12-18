package L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.interfaces.TimeProvider;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.interfaces.Writer;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.strategies.GreetingStrategy;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.strategies.greeting.AfternoonGreeting;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.strategies.greeting.EveningGreeting;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.strategies.greeting.MorningGreeting;

public class GreetingClock {
    private TimeProvider timeProvider;
    private Writer writer;
    private GreetingStrategy greetingStrategy;

    public GreetingClock(TimeProvider timeProvider, Writer writer) {
        this.timeProvider = timeProvider;
        this.writer = writer;
        this.setGreetingStrategy();
    }

    public void greeting() {
        this.setGreetingStrategy();
        this.writer.println(String.format("Good %s...", greetingStrategy.getGreeting()));
    }
    
    private void setGreetingStrategy(){
        if (this.timeProvider.getHour() < 12) {
            this.greetingStrategy = new MorningGreeting();
        } else if (this.timeProvider.getHour() < 18) {
            this.greetingStrategy = new AfternoonGreeting();
        } else {
            this.greetingStrategy = new EveningGreeting();
        }
    }
}
