package bg.softuni.interfaces;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.utils.RegistrationTime;

public interface Emergency {
    String getDescription();
    
    EmergencyLevel getEmergencyLevel();
    
    RegistrationTime getRegistrationTime();
    
    int getSpecialProperty();
}
