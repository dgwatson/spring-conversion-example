package com.example;

import org.springframework.core.convert.converter.Converter;

import java.util.Map;

public class MapToEmployeeConverter implements Converter<Map<String, String>, Employee> {

    @Override
    public Employee convert(Map<String, String> employeeData) {
        Employee employee = new Employee();
        employee.setId(Long.valueOf(employeeData.get("id")));
        employee.setFirstName(employeeData.get("firstName"));
        employee.setLastName(employeeData.get("lastName"));

        return employee;
    }
}
