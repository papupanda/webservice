package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDao {
	public List<Employee>getAllEmployee();
	public Integer saveEmployee(Employee e);
	public void deleteEmployee(Integer id);

}
