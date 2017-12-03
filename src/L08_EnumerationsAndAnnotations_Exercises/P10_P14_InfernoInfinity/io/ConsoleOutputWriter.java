package L08_EnumerationsAndAnnotations_Exercises.P10_P14_InfernoInfinity.io;

public class ConsoleOutputWriter implements OutputWriter {
    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }

    @Override
    public void writeLine(String format, Object... params) {
        System.out.println(String.format(format, params));
    }
}
