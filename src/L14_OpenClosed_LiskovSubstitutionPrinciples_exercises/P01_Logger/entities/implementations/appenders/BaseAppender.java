package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.appenders;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Appender;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.File;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.Layout;
import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;


public abstract class BaseAppender implements Appender {
    private Layout layout;
    private ReportLevel reportLevel;
    private File file;
    
    protected BaseAppender(Layout layout) {
        this.layout = layout;
        this.reportLevel = ReportLevel.INFO;
    }
    
    @Override
    public void setFile(File file) {
        this.file = file;
    }
    
    protected File getFile() {
        return this.file;
    }
    
    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }
    
    protected Layout getLayout() {
        return this.layout;
    }
    
    protected ReportLevel getReportLevel() {
        return this.reportLevel;
    }
    
    //    @Override
//    public void append(String dateTime, String message, ReportLevel reportLevel) {
//        if (this.reportLevel.compareTo(reportLevel) <= 0)
//            this.result.append(this.layout.format(dateTime, message, reportLevel))
//                    .append(System.lineSeparator());
//    }
}
