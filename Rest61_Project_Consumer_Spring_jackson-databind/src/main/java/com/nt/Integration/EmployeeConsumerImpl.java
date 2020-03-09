package com.nt.Integration;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.model.Employee;

@Component
public class EmployeeConsumerImpl implements IEmployeeConsumer {
	public String saveEmployee(Employee e) {
		String URL="http://localhost:3030/Rest61_Project_Producer_Jax_Rs_Hibernate/rest/emp/saveemp";
		RestTemplate rt=new RestTemplate();
		e.getEmpName();
		e.getEmpsal();
		String msg=rt.postForObject(URL, e, String.class);
		return msg;
	}
	@Override
	public List<Employee> getAllEmployee() {
		String URL="http://localhost:3030/Rest61_Project_Producer_Jax_Rs_Hibernate/rest/emp/get";
		RestTemplate rt=new RestTemplate();
		Employee[] arr=rt.getForObject(URL, Employee[].class);
		List<Employee> emp=Arrays.asList(arr);
		return emp;
	}
	@Override
	public ResponseEntity<String> delete(Integer id) {
		String URL="http://localhost:3030/Rest61_Project_Producer_Jax_Rs_Hibernate/rest/emp/delete?id=?";
		RestTemplate rt=new RestTemplate();
	    ResponseEntity<String> re=rt.exchange(URL, HttpMethod.DELETE,null,String.class);
	    re.getBody();
	    re.getStatusCode();
		return re;
	}

}
