package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.engine;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.controllers.EmployeeInfoProvider;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.controllers.InfoProvider;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models.Employee;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models.EmployeeDatabase;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models.Repository;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.views.ConsoleFormatter;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.views.Formatter;

public class ConsoleClient implements Runnable{
    @Override
    public void run() {
        Repository<Employee> repository = new EmployeeDatabase<>();
        InfoProvider<Employee> employeeInfo = new EmployeeInfoProvider<>(repository);
        Formatter formatter = new ConsoleFormatter();
    
        String output = formatter.format(employeeInfo.getEmployeesByName());
        System.out.println(output);
    }
}
