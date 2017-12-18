package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.controllers;

import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models.Employee;
import L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeInfoProvider<T extends Employee> implements InfoProvider<Employee> {

    private Repository<Employee> database;

    public EmployeeInfoProvider(Repository<Employee> database) {
        this.database = database;
    }

    @Override
    public List<Employee> getEmployeesByName() {
        return this.database.readEmployees().stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Employee> getEmployeesBySalary() {
        return this.database.readEmployees().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());
    }
}
