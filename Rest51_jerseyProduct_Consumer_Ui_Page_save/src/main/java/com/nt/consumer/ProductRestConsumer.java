package com.nt.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import ccom.nt.model.Product2;

public class ProductRestConsumer {
	public static String saveProduct(Product2 p) {
		 String uri="http://localhost:3030/Rest51_jerseyProductJdbcApp/";
		 String path="/rest/product/insert";
		 String out=null;
		try {
			Client c=ClientBuilder.newClient();
			WebTarget wt=c.target(uri).path(path);
			Builder builder=wt.request();
			Response resp=builder.post(Entity.json(p));
			out=resp.readEntity(String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out;
	}

}
