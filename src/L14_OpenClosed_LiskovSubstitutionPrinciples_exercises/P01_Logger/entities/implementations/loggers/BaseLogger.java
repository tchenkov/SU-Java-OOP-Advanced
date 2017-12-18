package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.loggers;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Appender;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Logger;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public abstract class BaseLogger implements Logger {
    private Appender[] appenders;
    private String date;
    private String message;
    private ReportLevel reportLevel;
    
    protected BaseLogger(Appender... appenders) {
        this.appenders = appenders;
    }
    
    @Override
    public void logInfo(String dateTime, String message) {
        for (Appender appender : this.appenders) {
            appender.append(dateTime, message, ReportLevel.INFO);
        }
    }
    
    @Override
    public void logWarning(String dateTime, String message) {
        for (Appender appender : this.appenders) {
            appender.append(dateTime, message, ReportLevel.WARNING);
        }
    }
    
    @Override
    public void logError(String dateTime, String message) {
        for (Appender appender : this.appenders) {
            appender.append(dateTime, message, ReportLevel.ERROR);
        }
    }
    
    @Override
    public void logCritical(String dateTime, String message) {
        for (Appender appender : this.appenders) {
            appender.append(dateTime, message, ReportLevel.CRITICAL);
        }
    }
    
    @Override
    public void logFatal(String dateTime, String message) {
        for (Appender appender : this.appenders) {
            appender.append(dateTime, message, ReportLevel.FATAL);
        }
    }
}
