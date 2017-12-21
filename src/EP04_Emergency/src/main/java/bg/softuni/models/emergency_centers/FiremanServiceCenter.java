package bg.softuni.models.emergency_centers;

import bg.softuni.interfaces.Emergency;
import bg.softuni.models.BaseEmergencyCenter;

public class FiremanServiceCenter extends BaseEmergencyCenter {
    public FiremanServiceCenter(String name, int amountOfMaximumEmergencies) {
        super(name, amountOfMaximumEmergencies);
    }
    
    @Override
    public long getProcessedStatistics() {
        return super.getEmergencies().stream()
                .mapToLong(Emergency::getSpecialProperty).sum();
    }
    
    @Override
    public String toString() {
        return "Registered Fire Service Emergency Center - " + super.getName() + ".";
    }
}
