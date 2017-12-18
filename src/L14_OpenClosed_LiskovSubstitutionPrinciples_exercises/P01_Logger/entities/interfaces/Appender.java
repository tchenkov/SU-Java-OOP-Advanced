package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public interface Appender {
    
    void setFile(File file);
    
    void setReportLevel(ReportLevel error);
    
    void append(String dateTime, String message, ReportLevel reportLevel);
}
