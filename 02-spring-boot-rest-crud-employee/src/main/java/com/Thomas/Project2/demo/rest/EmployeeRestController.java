package com.Thomas.Project2.demo.rest;

import com.Thomas.Project2.demo.dao.EmployeeDAO;
import com.Thomas.Project2.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    //constructor injections
    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    //expose "/employee" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> employeeList() {
        return employeeDAO.findAll();
    }

}
