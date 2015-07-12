package com.demo.service;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmpService {
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("serviceimpl object is created");
	}
	
	@Autowired
	private EmployeeDao empDao;

	@Override
	public Response getEmployeeDetail() {
		return Response.ok(empDao.getEmpDetails()).build();
	}

}
