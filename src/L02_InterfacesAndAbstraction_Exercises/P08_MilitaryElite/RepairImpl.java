package L02_InterfacesAndAbstraction_Exercises.P08_MilitaryElite;

public class RepairImpl implements Repair {
    private String partName;
    private int hoursWorked;
    
    public RepairImpl(String partName, int hoursWorked) {
        this.partName = partName;
        setHoursWorked(hoursWorked);
    }
    
    private void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0){
            throw new IllegalArgumentException();
        }
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public String getPartName() {
        return this.partName;
    }
    
    @Override
    public int getHoursWorked() {
        return this.hoursWorked;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Part Name: %s Hours Worked: %d",
                this.partName, this.hoursWorked
        );
    }
}
