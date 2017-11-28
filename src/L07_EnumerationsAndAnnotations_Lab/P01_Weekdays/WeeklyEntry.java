package L07_EnumerationsAndAnnotations_Lab.P01_Weekdays;

public class WeeklyEntry implements Comparable<WeeklyEntry>{
    private Weekday weekday;
    private String notes;
    
    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Weekday.valueOf(weekday.toUpperCase());
        this.notes = notes;
    }
    
    @Override
    public int compareTo(WeeklyEntry weeklyEntry) {
        return this.weekday.compareTo(weeklyEntry.weekday);
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s - %s",
                this.weekday,
                this.notes
        );
    }
}
