package com.nt.Integration;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.nt.model.Employee;

public interface IEmployeeConsumer {
	public String saveEmployee(Employee e);
	public List<Employee> getAllEmployee();
	public ResponseEntity<String> delete(Integer id);

}
