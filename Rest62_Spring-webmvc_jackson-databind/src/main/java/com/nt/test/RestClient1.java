package com.nt.test;

import org.springframework.web.client.RestTemplate;

import com.nt.model.Employee;

public class RestClient1 {

	public static void main(String[] args) {
		String url="http://localhost:3030/Rest61_Project_Producer_Jax_Rs_Hibernate/rest/emp/saveemp";
		RestTemplate rt=new RestTemplate();
		Employee e=new Employee();
		e.setEmpName("sita");
		e.setEmpsal(66.67);
		String msg=rt.postForObject(url, e, String.class);
		System.out.println(msg);
	}

}
