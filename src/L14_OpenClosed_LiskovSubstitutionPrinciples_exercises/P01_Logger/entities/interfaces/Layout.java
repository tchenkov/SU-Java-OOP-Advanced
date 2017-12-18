package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public interface Layout {
    String format(String dateTime, String message, ReportLevel reportLevel);
}
