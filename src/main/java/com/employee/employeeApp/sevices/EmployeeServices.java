package com.employee.employeeApp.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeApp.model.Employee;
import com.employee.employeeApp.repos.EmployeeRepsitory;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepsitory repo;
	
	public Employee saveEmployee(Employee emp) {
		
		return repo.save(emp);
			
	}
public Optional<Employee> getEmployee(long id) {
		
		return repo.findById(id);
			
	}
public List<Employee> getEmployees() {
	
	return repo.findAll();
		
}
	public Employee updateEmployee(long id, Employee emp) {
		
		Employee remp = repo.findById(id).orElseGet(()->repo.save(emp));
		remp.setName(emp.getName());
		remp.setPosition(emp.getPosition());
		return repo.save(remp);
	}
	public void deleteEmployee(long id) {
		repo.deleteById(id);
	}
	

}
