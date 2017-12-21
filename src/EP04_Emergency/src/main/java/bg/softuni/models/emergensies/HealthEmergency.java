package bg.softuni.models.emergensies;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.models.BaseEmergency;
import bg.softuni.utils.RegistrationTime;

public class HealthEmergency extends BaseEmergency {
    private int casualties;
    
    public HealthEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime, int casualties) {
        super(description, emergencyLevel, registrationTime);
        this.casualties = casualties;
    }
    
    @Override
    public int getSpecialProperty() {
        return this.casualties;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Registered Public Health Emergency of level %s at %s.",
                super.getEmergencyLevel().name(),
                super.getRegistrationTime().toString()
        );
    }
}
