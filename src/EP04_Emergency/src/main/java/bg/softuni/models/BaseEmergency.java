package bg.softuni.models;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.interfaces.Emergency;
import bg.softuni.utils.RegistrationTime;

public abstract class BaseEmergency implements Emergency {
    private String description;
    private EmergencyLevel emergencyLevel;
    private RegistrationTime registrationTime;
    
    protected BaseEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime) {
        this.description = description;
        this.emergencyLevel = emergencyLevel;
        this.registrationTime = registrationTime;
    }
    
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public EmergencyLevel getEmergencyLevel() {
        return emergencyLevel;
    }

    @Override
    public RegistrationTime getRegistrationTime() {
        return registrationTime;
    }
    
    
}
