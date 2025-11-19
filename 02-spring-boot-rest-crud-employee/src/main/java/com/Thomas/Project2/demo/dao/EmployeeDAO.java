package com.Thomas.Project2.demo.dao;

import com.Thomas.Project2.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
}
