package com.nt.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.nt.dao.StudentDao;
import com.nt.dao.StudentDaoImpl;
import com.nt.service.StudentService;
import com.nt.service.StudentServiceImpl;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {
	public AppConfig() {
		packages("com.nt.integrationLayer");
		register(new AbstractBinder() {
			
			@Override
			public void configure() {
				bind(StudentDaoImpl.class).to(StudentDao.class);
				bind(StudentServiceImpl.class).to(StudentService.class);
				
			}
		});
	}

}
