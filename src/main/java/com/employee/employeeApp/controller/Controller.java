package com.employee.employeeApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeApp.model.Employee;
import com.employee.employeeApp.sevices.EmployeeServices;

@RestController
public class Controller {
	
	@Autowired
	EmployeeServices emps;
	
	@GetMapping("/")
	public List<Employee> home() {
		return emps.getEmployees();
	}
	@GetMapping("/employee/{id}")
	public Optional<Employee> employee(@PathVariable long id) {
		return emps.getEmployee(id);
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return emps.saveEmployee(employee);
	}
	@PutMapping("/add/{id}")
	public Employee updateEmployee(@PathVariable long id, @RequestBody Employee emp) {
		return emps.updateEmployee(id,emp);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable long id) {
			emps.deleteEmployee(id);
			System.out.println("Hello world");
	}
	
	
	

}
