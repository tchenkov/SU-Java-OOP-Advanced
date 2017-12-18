package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.appenders;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Layout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public class ConsoleAppender extends BaseAppender {
    public ConsoleAppender(Layout layout) {
        super(layout);
    }
    
    @Override
    public void append(String dateTime, String message, ReportLevel reportLevel) {
        if (super.getReportLevel().compareTo(reportLevel) <= 0) {
            System.out.println(super.getLayout().format(dateTime, message, reportLevel));
        }
    }
}
