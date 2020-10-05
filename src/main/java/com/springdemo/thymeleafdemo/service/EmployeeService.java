package com.springdemo.thymeleafdemo.service;

import com.springdemo.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    void save(Employee employee);
    void deleteById(int id);
}
