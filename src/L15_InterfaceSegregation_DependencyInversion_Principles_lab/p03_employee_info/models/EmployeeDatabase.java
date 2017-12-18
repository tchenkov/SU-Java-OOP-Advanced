package L15_InterfaceSegregation_DependencyInversion_Principles_lab.p03_employee_info.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabase<T extends Employee> implements Repository<Employee>{

    @Override
    public List<Employee> readEmployees() {
        List<Employee> employees = new ArrayList<>();
        Collections.addAll(employees,
                new BaseEmployee("Pesho", 20),
                new BaseEmployee("Gosho", 40));

        return employees;
    }
}
