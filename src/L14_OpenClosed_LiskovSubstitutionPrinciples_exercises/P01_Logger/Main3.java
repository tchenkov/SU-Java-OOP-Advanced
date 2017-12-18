package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.appenders.ConsoleAppender;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.appenders.FileAppender;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.files.LogFile;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.layouts.SimpleLayout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.loggers.MessageLogger;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Appender;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.File;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Layout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Logger;


public class Main3 {
    public static void main(String[] args) {
        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
    
        File file = new LogFile();
        Appender fileAppender = new FileAppender(simpleLayout);
        fileAppender.setFile(file);
    
        Logger logger = new MessageLogger(consoleAppender, fileAppender);
    
        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");
    }
}
