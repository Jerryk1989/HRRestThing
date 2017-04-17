package services;


import com.astontech.hr.Application;
import com.astontech.hr.domain.Employee;
import com.astontech.hr.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
/**
 * Created by Jerry.Kelsay on 4/4/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void employeeServiceSaveTest() {

        Employee employee = new Employee();
        employee.setFirstName("Bipin");
        employee.setLastName("Butala");
        employee.setBackground("Java Developer");

        assertNull(employee.getId());
        employeeService.saveEmployee(employee);
        assertNotNull(employee.getId());

        //fetch
        Employee fetchedEmployee = employeeService.getEmployeeById(employee.getId());

        assertNotNull(fetchedEmployee);
        assertEquals(employee.getId(), fetchedEmployee.getId());

        //update
        fetchedEmployee.setFirstName("Piper");
        employeeService.saveEmployee(fetchedEmployee);

        Employee updatedEmployee = employeeService.getEmployeeById(fetchedEmployee.getId());
        assertEquals("Piper", updatedEmployee.getFirstName());
    }
}
