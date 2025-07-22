package com.spring.application.practice.service;

import com.example.model.Employee;
import com.example.model.EmployeeInput;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees (){
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(1, "Saurabh Roy", "saurabh@gmail.com", "Engineering", 1060000.00, OffsetDateTime.now());
        employeeList.add(emp1);
        return employeeList;
    }


    public Employee createEmployee(EmployeeInput employee) {
        return new Employee(2, employee.getName(), employee.getEmail(), employee.getDepartment(), employee.getSalary(), OffsetDateTime.now());
    }
}
