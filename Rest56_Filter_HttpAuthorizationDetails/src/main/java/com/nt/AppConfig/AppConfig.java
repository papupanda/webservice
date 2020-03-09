package com.nt.AppConfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.nt.filter.SecurityFilter;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {
	public AppConfig() {
		packages("com.nt.controller");
		register(SecurityFilter.class);
	}

}
