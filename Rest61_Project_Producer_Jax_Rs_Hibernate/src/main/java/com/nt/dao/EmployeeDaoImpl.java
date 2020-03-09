package com.nt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Employee;
import com.nt.utils.HibernateUtil;

public  class EmployeeDaoImpl implements IEmployeeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> list=null;
		try(Session ses=HibernateUtil.getsf().openSession()){
			list=ses.createQuery("from com.nt.model.Employee e")
					.list();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Integer saveEmployee(Employee e) {
		Transaction tx=null;
		Integer id=null;
		try(Session ses=HibernateUtil.getsf().openSession()){
		  tx=ses.beginTransaction();
		  id=(Integer) ses.save(e);
		  tx.commit();
		}
		  catch (Exception e2) {
			  tx.rollback();
			e2.printStackTrace();
		}
		return id;
	}
	@Override
	public void deleteEmployee(Integer id) {
		Transaction tx=null;
		try(Session ses=HibernateUtil.getsf().openSession()){
			Object o=ses.load(Employee.class,new Integer(id));
			Employee e=(Employee)o;
			tx=ses.beginTransaction();
			ses.delete(e);
			tx.commit();
		}
		catch(Exception e2) {
			tx.rollback();
			e2.printStackTrace();
		}
	}

}
