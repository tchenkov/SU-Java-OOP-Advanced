package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info;


import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.engine.ConsoleClient;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.engine.Runnable;

public class Main {

    public static void main(String[] args) {
        Runnable engine = new ConsoleClient();
        engine.run();
    }
}
