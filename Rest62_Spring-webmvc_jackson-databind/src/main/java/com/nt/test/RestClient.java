package com.nt.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.nt.model.Employee;

public class RestClient {

	public static void main(String[] args) {
		String url="http://localhost:3030/Rest61_Project_Producer_Jax_Rs_Hibernate/rest/emp/get";
		RestTemplate rt=new RestTemplate();
		Employee[] arr=rt.getForObject(url, Employee[].class);
		List<Employee> emps=Arrays.asList(arr);
		emps.forEach(System.out::println);
	}

}
