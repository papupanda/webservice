package com.nt.service;

import javax.inject.Inject;

import com.nt.dao.StudentDao;
import com.nt.model.Student;

public class StudentServiceImpl implements StudentService {
	@Inject
	private StudentDao dao;

	public int save(Student s) {
		double fee=s.getFee();
		double Discount=fee*10/100;
		s.setDiscount(Discount);
		return dao.saveStudent(s);
	}
	

}
