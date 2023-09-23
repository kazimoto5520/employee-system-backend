package com.mesha.Employee.services;

import com.mesha.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
