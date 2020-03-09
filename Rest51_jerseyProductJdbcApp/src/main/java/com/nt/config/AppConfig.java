package com.nt.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.nt.dao.IProductDao;
import com.nt.dao.ProductImpl;
import com.nt.service.IProductService;
import com.nt.service.ProductServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		packages("com.nt.controller");
		register(new AbstractBinder() {
			
			@Override
			public void configure() {
			bind(ProductImpl.class).to(IProductDao.class);
			bind(ProductServiceImpl.class).to(IProductService.class);
			}
		});
	}
}
