package com.employee.employeeApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeeApp.model.Employee;

public interface EmployeeRepsitory extends JpaRepository<Employee, Long> {

}
