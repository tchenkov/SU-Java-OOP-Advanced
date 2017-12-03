package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io;

public interface OutputWriter {
    void writeLine(String output);

    void writeLine(String format, Object... params);
}