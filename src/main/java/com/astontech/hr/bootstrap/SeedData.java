package com.astontech.hr.bootstrap;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.ElementType;
import com.astontech.hr.domain.Employee;
import com.astontech.hr.services.ElementService;
import com.astontech.hr.services.ElementTypeService;
import com.astontech.hr.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry.Kelsay on 3/15/2017.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ElementService elementService;

    @Autowired
    private ElementTypeService elementTypeService;

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

       // generateElementAndElementTypes();
        generateEmployee();
    }

    private void generateElementAndElementTypes() {

        ElementType laptopType = new ElementType("Laptop");

        List<Element> elementList = new ArrayList<>();

        elementList.add(new Element("Acer"));
        elementList.add(new Element("Apple"));
        elementList.add(new Element("Dell"));
        elementList.add(new Element("Samsung"));

        laptopType.setElementList(elementList);

        elementTypeService.saveElementType(laptopType);

    }

    private void generateEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Bipin");
        employee.setLastName("Butala");
        employee.setBackground("Java Developer");
        employeeService.saveEmployee(employee);

        Employee employee2 = new Employee();
        employee2.setFirstName("Jerry");
        employee2.setLastName("Kelsay");
        employee2.setBackground("Nobody");
        employeeService.saveEmployee(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Piper");
        employee3.setLastName("Chapman");
        employee3.setBackground("Pipex");
        employeeService.saveEmployee(employee3);

        Employee employee4 = new Employee();
        employee4.setFirstName("Alex");
        employee4.setLastName("Vause");
        employee4.setBackground("Importing");
        employeeService.saveEmployee(employee4);
    }
}
