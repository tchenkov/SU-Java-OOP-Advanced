package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.appenders;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.files.LogFile;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Layout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public class FileAppender extends BaseAppender {
    public FileAppender(Layout layout) {
        super(layout);
        super.setFile(new LogFile());
    }
    
    @Override
    public void append(String dateTime, String message, ReportLevel reportLevel) {
        if (super.getReportLevel().compareTo(reportLevel) <= 0) {
            super.getFile().write(super.getLayout().format(dateTime, message, reportLevel));
            
            
        }
    }
}
