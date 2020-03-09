package com.nt.service;

public class EmpServiceImpl implements IEmpService {

	public EmpServiceImpl() {
		System.out.println("service object");
	}
	@Override
	public String getdata() {
		
		return "from service";
	}

}
