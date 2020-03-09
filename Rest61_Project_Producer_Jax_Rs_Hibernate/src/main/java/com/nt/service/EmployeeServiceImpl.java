package com.nt.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import com.nt.dao.IEmployeeDao;
import com.nt.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	@Inject
	private IEmployeeDao dao;

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emps=dao.getAllEmployee();
		Collections.sort(emps);
		return emps;
	}

	@Override
	public Integer saveEmployee(Employee e) {
		
		return dao.saveEmployee(e);
	}

	@Override
	public void deleteEmployee(Integer id) {
		
		dao.deleteEmployee(id);
	}

}
