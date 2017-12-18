package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.layouts;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Layout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public abstract class BaseLayout implements Layout{
    
    public abstract String format(String dateTime, String message, ReportLevel reportLevel);
}
