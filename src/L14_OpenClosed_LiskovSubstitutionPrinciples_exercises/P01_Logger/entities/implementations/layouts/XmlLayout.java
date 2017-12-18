package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.layouts;

import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.enumerations.ReportLevel;

public class XmlLayout extends BaseLayout{
    @Override
    public String format(String dateTime, String message, ReportLevel reportLevel) {
        final StringBuilder output = new StringBuilder();
        output.append("<log>").append(System.lineSeparator());
        output.append("   <date>").append(dateTime).append("</date>").append(System.lineSeparator());
        output.append("   <level>").append(reportLevel.name()).append("</level>").append(System.lineSeparator());
        output.append("   <message>").append(message).append("</message>").append(System.lineSeparator());
        output.append("</log>");
        return output.toString();
    }
}
