package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.ConversionService;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ConversionService conversionService;

	@Override
	public void run(String... args) {
		Map<String, String> employeeData = new HashMap();
		employeeData.put("id", "9547292");
		employeeData.put("firstName", "David");
		employeeData.put("lastName", "Watson");

		Employee employee = conversionService.convert(employeeData, Employee.class);
		System.out.println(employee);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
