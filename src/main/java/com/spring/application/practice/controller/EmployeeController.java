package com.spring.application.practice.controller;

import com.example.model.Employee;
import com.example.model.EmployeeInput;
import com.spring.application.practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        if(employeeList != null && !employeeList.isEmpty()){
            return new ResponseEntity<>(employeeList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Employee> createEmployee(EmployeeInput employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }
}
