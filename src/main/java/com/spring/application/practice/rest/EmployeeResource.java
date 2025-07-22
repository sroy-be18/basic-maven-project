package com.spring.application.practice.rest;

import com.example.model.Employee;
import com.example.model.EmployeeInput;
import com.spring.application.practice.controller.EmployeeController;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeResource implements com.example.api.EmployeesApi {


    @Autowired
    EmployeeController employeeController;
    @Override
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return employeeController.getAllEmployees();
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateEmployee(Integer id, EmployeeInput employeeInput) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody EmployeeInput employee){
        return employeeController.createEmployee(employee);

    }

    @Override
    public ResponseEntity<Void> deleteEmployee(Integer id) {
        return null;
    }

}
