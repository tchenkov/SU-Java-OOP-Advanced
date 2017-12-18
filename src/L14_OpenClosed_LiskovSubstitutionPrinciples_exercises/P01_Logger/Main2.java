package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.appenders.ConsoleAppender;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.layouts.SimpleLayout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.loggers.MessageLogger;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Appender;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Layout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Logger;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public class Main2 {
    public static void main(String[] args) {
        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        consoleAppender.setReportLevel(ReportLevel.ERROR);
    
        Logger logger = new MessageLogger(consoleAppender);
    
        logger.logInfo("3/31/2015 5:33:07 PM", "Everything seems fine");
        logger.logWarning("3/31/2015 5:33:07 PM", "Warning: ping is too high - disconnect imminent");
        logger.logError("3/31/2015 5:33:07 PM", "Error parsing request");
        logger.logCritical("3/31/2015 5:33:07 PM", "No connection string found in App.config");
        logger.logFatal("3/31/2015 5:33:07 PM", "mscorlib.dll does not respond");
    }
}
