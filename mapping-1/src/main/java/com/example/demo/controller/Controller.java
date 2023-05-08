package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Employeedetails;

@RestController

public class Controller {
		
		@Autowired  
		Service service;
		
		@PostMapping("/emp")
		public String addemp (@RequestBody Employee emp)
		{
			return service.addEmployee(emp);
		}
		@GetMapping("/emp")
		public List<Employee>getEmployee()
		{
			return service.getAllEmployee();
		}
}
