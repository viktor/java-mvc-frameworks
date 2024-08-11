package com.strutsexample.app.service;

import java.util.List;

import org.hibernate.Session;

import com.strutsexample.app.entity.Employee;
import com.strutsexample.app.utils.HibernateSessionUtils;

public class EmployeeService {
	Session session = null;

	public EmployeeService() {
		session = HibernateSessionUtils.getSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAll(){
		List<Employee> list = session.createCriteria(Employee.class).list();
		return list;
	}
}
