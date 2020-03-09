package com.nt.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.nt.filter.MyReqFilter;
import com.nt.filter.MyResFilter;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {
	public AppConfig() {
		packages("com.nt.controller");
		register(MyReqFilter.class);
		register(MyResFilter.class);
	}

}
