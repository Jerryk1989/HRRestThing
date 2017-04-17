package com.astontech.hr.services;

import com.astontech.hr.domain.Employee;

/**
 * Created by Jerry.Kelsay on 4/4/2017.
 */
public interface EmployeeService {

    Iterable<Employee> listAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee saveEmployee(Employee employee);

    Iterable<Employee> saveEmployeeList(Iterable<Employee> employeeIterable);

    void deleteEmployee(Integer id);
}
