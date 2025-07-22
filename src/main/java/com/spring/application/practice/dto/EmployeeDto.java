package com.spring.application.practice.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Integer id;
    private String name;
    private String email;
    private String department;
    private Double salary;
}
