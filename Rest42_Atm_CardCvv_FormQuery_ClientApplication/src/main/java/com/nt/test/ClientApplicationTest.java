package com.nt.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

public class ClientApplicationTest {

	public static void main(String[] args) {
		try {
			Form f=new Form();
			f.param("amt", "10838");
			f.param("cnum", "axis");
			f.param("cname", "satya");
			f.param("cvv", "234");
			f.param("dte", "13/02/2024");
		String uri="http://localhost:3030/Rest42_Atm_CardCvv_FormParam/";
		String path="/rest/card";
		Response res=ClientBuilder.newClient()
		.target(uri).path(path)
		.request()
		.post(Entity.form(f));
		System.out.println(res.getStatus());
		System.out.println(res.getStatusInfo());
		System.out.println(res.readEntity(String.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
