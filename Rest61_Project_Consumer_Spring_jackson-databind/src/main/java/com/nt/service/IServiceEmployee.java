package com.nt.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.nt.model.Employee;

public interface IServiceEmployee {
	public String SaveEmployee(Employee e);
	public List<Employee> getAllEmployee();
	public ResponseEntity<String> deleteEmployee(Integer id);

}
