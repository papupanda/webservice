package com.nt.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class Client_min_max {

	public static void main(String[] args) {
		String uri="http://localhost:3030/Min_Max_QueryParam/";
		String path="/rest/minmax";
		Response resp=ClientBuilder.newClient()
				.target(uri)
				.path(path)
				.queryParam("numa", 100)
				.queryParam("numb", 500)
				.queryParam("numc", 1000)
				.request().get();
		System.out.println(resp.getStatus());
		System.out.println(resp.getStatusInfo());
		System.out.println(resp.readEntity(String.class));

	}

}
