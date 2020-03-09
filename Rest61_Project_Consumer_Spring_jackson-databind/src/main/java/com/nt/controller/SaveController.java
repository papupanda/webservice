package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;
import com.nt.service.IServiceEmployee;

@Controller
public class SaveController {
	@Autowired
	private IServiceEmployee service;
	@RequestMapping("/first")
	public String First(Model model,@ModelAttribute Employee e) {
		
		model.addAttribute("emp",e);
		return "Show";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String SaveForm(@ModelAttribute("emp") Employee e,Model model) {
		String msg=service.SaveEmployee(e);
		model.addAttribute("msg",msg);
		return "Show";
	}
	@RequestMapping("/get")
	public String GetAllEmp(Model model) {
		List<Employee> list=service.getAllEmployee();
		model.addAttribute("list",list);
		return "ShowAll";
	}
	@RequestMapping("/delete")
	public String deleteEmp(HttpServletRequest req,Model model) {
		String id=req.getParameter("id");
		service.deleteEmployee(Integer.parseInt(id));
		List<Employee> list=service.getAllEmployee();
		model.addAttribute("list",list);
		return "ShowAll";
	}

}
