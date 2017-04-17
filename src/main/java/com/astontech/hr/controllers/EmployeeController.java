package com.astontech.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jerry.Kelsay on 4/4/2017.
 */
@Controller
public class EmployeeController {

    @RequestMapping("/employee")
    public String employeePage() {

        return "employee";
    }
}
