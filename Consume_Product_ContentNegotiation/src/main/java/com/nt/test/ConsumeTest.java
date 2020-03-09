package com.nt.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class ConsumeTest {

	public static void main(String[] args) {
		try {
			Response resp=ClientBuilder.newClient()
					.target("//localhost:3030/RestProduct_Produce_ContentNegotiation/")
					.path("/rest/product")
					.request()
					.header("Accept","application/xml")
					.get();
		    System.out.println(resp.getStatus());   
		    System.out.println(resp.getStatusInfo()); 
		    System.out.println(resp.readEntity(String.class)); 
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
