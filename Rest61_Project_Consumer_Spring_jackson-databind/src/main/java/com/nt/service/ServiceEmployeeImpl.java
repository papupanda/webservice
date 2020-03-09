package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nt.Integration.IEmployeeConsumer;
import com.nt.model.Employee;

@Service
public class ServiceEmployeeImpl implements IServiceEmployee {
    @Autowired
	private IEmployeeConsumer consumer;
	@Override
	public String SaveEmployee(Employee e) {
		
		return consumer.saveEmployee(e);
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return consumer.getAllEmployee();
	}
	@Override
	public ResponseEntity<String> deleteEmployee(Integer id) {
		
		return consumer.delete(id);
	}

}
