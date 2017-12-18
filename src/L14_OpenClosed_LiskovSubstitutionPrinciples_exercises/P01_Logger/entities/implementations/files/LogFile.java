package L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.implementations.files;


import L14_OpenClosed_LiskovSubstitutionPrinciples_exercises.P01_Logger.entities.interfaces.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogFile implements File {
    private java.io.File logFile;
    
    public LogFile() {
        this.logFile = new java.io.File("log.txt");
    }
    
    @Override
    public void write(String text){
        try (FileWriter fw = new FileWriter(this.logFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
