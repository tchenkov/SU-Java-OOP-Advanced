package L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.implementations;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.P01_SystemResources.core.interfaces.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public void println(String string) {
        System.out.println(string);
    }
}
