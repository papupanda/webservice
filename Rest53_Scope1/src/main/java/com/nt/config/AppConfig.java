package com.nt.config;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.api.Immediate;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.glassfish.jersey.server.ResourceConfig;



import com.nt.service.EmpServiceImpl;
import com.nt.service.IEmpService;
@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {
	@Inject
	public AppConfig(ServiceLocator locator) {
		ServiceLocatorUtilities.
		enableImmediateScope(locator);
		packages("com.nt.controller");
		register(new AbstractBinder() {
			
			@Override
			public void configure() {
				
				bind(EmpServiceImpl.class).to(IEmpService.class)
				//.in(RequestScoped.class);
				//.in(Singleton.class);
				  .in(Immediate.class);
				
			}
		});
	}

}
