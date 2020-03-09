package com.nt.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class MyConfig extends ResourceConfig {

	public MyConfig() {
		packages("com.nt.controller");
	}
}
