package com.nt.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.nt.util.SecureUtil;

public class ClientApp {

	private static String uri="http://localhost:3030/Rest47_Producer_Application_for_Security/";
	private static String path="rest/secure";

	public static void main(String[] args) {
		Client c=ClientBuilder.newClient();
		WebTarget wt=c.target(uri).path(path);
		Builder b=wt.request();
	    Response rsp=b.header("Authorization", SecureUtil.convert("admin", "nit")).get();
	    System.out.println(rsp.getStatus());
	    System.out.println(rsp.getStatusInfo());
	    System.out.println(rsp.readEntity(String.class));

	}

}
