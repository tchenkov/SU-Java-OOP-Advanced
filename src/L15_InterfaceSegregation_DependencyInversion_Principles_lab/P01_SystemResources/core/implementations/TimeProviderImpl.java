package L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.implementations;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.interfaces.TimeProvider;

import java.time.LocalTime;

public class TimeProviderImpl implements TimeProvider {
    public TimeProviderImpl() {
    }
    
    @Override
    public int getHour() {
        return LocalTime.now().getHour();
    }
}
