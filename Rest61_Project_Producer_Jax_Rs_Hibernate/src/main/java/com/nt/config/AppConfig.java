package com.nt.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.nt.dao.EmployeeDaoImpl;
import com.nt.dao.IEmployeeDao;
import com.nt.service.EmployeeServiceImpl;
import com.nt.service.IEmployeeService;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		packages("com.nt.controller");
		register(new AbstractBinder() {
			
			@Override
			protected void configure() {
				
			bind(EmployeeDaoImpl.class).to(IEmployeeDao.class);
			bind(EmployeeServiceImpl.class).to(IEmployeeService.class);
			}
		});
	}
}
