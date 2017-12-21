package bg.softuni.models.emergensies;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.models.BaseEmergency;
import bg.softuni.utils.RegistrationTime;

public class PropertyEmergency extends BaseEmergency {
    private int damage;
    
    public PropertyEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime, int damage) {
        super(description, emergencyLevel, registrationTime);
        this.damage = damage;
    }
    
    @Override
    public int getSpecialProperty() {
        return this.damage;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Registered Public Property Emergency of level %s at %s.",
                super.getEmergencyLevel().name(),
                super.getRegistrationTime().toString()
        );
    }
}
