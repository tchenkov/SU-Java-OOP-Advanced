package L07_EnumerationsAndAnnotations_Lab.P01_Weekdays;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        weeklyCalendar.addEntry("Friday", "sleep");
        weeklyCalendar.addEntry("monday", "sport");
        Iterable<WeeklyEntry> weeklyEntries = weeklyCalendar.getWeeklySchedule();
        for (WeeklyEntry weeklyEntry:weeklyEntries) {
            System.out.println(weeklyEntry);
        }
    }
}
