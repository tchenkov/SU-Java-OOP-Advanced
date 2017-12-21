package bg.softuni.models.emergency_centers;

import bg.softuni.models.BaseEmergencyCenter;

public class PoliceServiceCenter extends BaseEmergencyCenter {
    public PoliceServiceCenter(String name, int amountOfMaximumEmergencies) {
        super(name, amountOfMaximumEmergencies);
    }
    
    @Override
    public long getProcessedStatistics() {
        return super.getEmergencies().stream()
                .filter(e -> e.getSpecialProperty() == 1).count();
    }
    
    @Override
    public String toString() {
        return "Registered Police Service Emergency Center - " + super.getName() + ".";
    }
}
