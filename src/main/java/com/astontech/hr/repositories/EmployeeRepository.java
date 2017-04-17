package com.astontech.hr.repositories;

import com.astontech.hr.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jerry.Kelsay on 4/4/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
