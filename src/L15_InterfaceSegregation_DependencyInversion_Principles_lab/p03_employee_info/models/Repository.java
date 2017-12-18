package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models;

import java.util.List;

public interface Repository<T extends Employee> {
    List<Employee> readEmployees();
}
