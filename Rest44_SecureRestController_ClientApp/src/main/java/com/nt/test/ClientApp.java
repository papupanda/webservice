package com.nt.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class ClientApp {

	public static void main(String[] args) {
		String uri = "http://localhost:3030/Rest44-SecureRestController_HeaderParam/";
		String path = "rest/secure";
	Client c=ClientBuilder.newClient();
	WebTarget wt=c.target(uri).path(path);
	Builder builder=wt.request();
	Response res=builder.header("clientid", 123)
	.header("securecode", "ABC")
	.get();
	System.out.println(res.getStatus());
	System.out.println(res.getStatusInfo());
	System.out.println(res.readEntity(String.class));
	
	}

}
