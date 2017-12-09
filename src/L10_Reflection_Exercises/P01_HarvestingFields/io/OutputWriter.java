package L10_Reflection_Exercises.P01_HarvestingFields.io;

public interface OutputWriter {
    void writeLine(String output);

    void writeLine(String format, Object... params);
}