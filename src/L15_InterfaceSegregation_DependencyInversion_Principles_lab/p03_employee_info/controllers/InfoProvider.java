package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.controllers;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models.Employee;

import java.util.List;

public interface InfoProvider<T extends Employee> {
    
    List<T> getEmployeesByName();
    
    Iterable<T> getEmployeesBySalary();
}
