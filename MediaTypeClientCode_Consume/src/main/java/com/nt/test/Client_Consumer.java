package com.nt.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import com.nt.model.Consumer1;

public class Client_Consumer {

	public static void main(String[] args) {
		try {
			Consumer1 c1=new Consumer1();
			c1.setCid(1);
			c1.setCname("kk");
			c1.setType("hhh");
			String uri = "http://localhost:3030/MediaTypeClientCode_Producer/";
			String path = "/rest/con";
			Response resp=ClientBuilder
					.newClient()
					.target(uri)
					.path(path)
					.request()
					.post(Entity.json(c1));
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
