package com.demo.dao;

import com.demo.model.Employee;

public class EmployeeDao {
	
	public EmployeeDao() {
		// TODO Auto-generated constructor stub
		System.out.println("object created");
	}
	public Employee getEmpDetails() {

		Employee emp = new Employee();
		
		emp.setDateOfJoining("01-02-2001");
		emp.setDepartment("Sales");
		emp.setEmail("test@example.com");
		emp.setEmployeeId("675436");
		emp.setFirstName("John");
		emp.setLastName("Smith");
		return emp;

	}
	
}
