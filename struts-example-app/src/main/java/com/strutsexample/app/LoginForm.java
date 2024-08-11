package com.strutsexample.app;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.strutsexample.app.entity.Employee;

public class LoginForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	String username;
	String password;
	String message;
	List<Employee> employees;
	
	public LoginForm() {
		super();
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.password = null;
	}
}
