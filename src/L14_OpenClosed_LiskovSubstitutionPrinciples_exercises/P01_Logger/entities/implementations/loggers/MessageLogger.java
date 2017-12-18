package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.loggers;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Appender;

public class MessageLogger extends BaseLogger {
    public MessageLogger(Appender... appender) {
        super(appender);
    }
    
    
}
