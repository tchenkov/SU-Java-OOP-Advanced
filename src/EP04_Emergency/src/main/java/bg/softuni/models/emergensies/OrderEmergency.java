package bg.softuni.models.emergensies;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.models.BaseEmergency;
import bg.softuni.utils.RegistrationTime;

public class OrderEmergency extends BaseEmergency {
    private static final int SPECIAL_STATUS = 1;
    private static final int NON_SPECIAL_STATUS = 0;
    private static final int INVALID_STATUS = -1;
    private int status;
    
    public OrderEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime, String status) {
        super(description, emergencyLevel, registrationTime);
        this.setStatus(status);
    }
    
    private void setStatus(String status) {
        if (status.equals("Special")){
            this.status = SPECIAL_STATUS;
            return;
        }
    
        if (status.equals("Non-Special")){
            this.status = NON_SPECIAL_STATUS;
            return;
        }
        
        this.status = INVALID_STATUS;
    }
    
    @Override
    public int getSpecialProperty() {
        return this.status;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Registered Public Order Emergency of level %s at %s.",
                super.getEmergencyLevel().name(),
                super.getRegistrationTime().toString()
        );
    }
}
