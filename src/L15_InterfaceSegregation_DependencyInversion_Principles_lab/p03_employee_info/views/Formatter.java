package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.views;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models.Employee;

public interface Formatter {
    String format(Iterable<Employee> employees);
}
