package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.layouts;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public class SimpleLayout extends BaseLayout {
    // TODO date time
    
    // TODO report level
    
    // TODO message
    
    @Override
    public String format(String dateTime, String message, ReportLevel reportLevel){
        return String.format(
                "%s - %s - %s",
                dateTime,
                reportLevel.name(),
                message
        );
    }
}
