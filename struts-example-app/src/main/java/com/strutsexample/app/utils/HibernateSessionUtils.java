package com.strutsexample.app.utils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.strutsexample.app.entity.Employee;

public class HibernateSessionUtils {
	
    public static Session session;
	
    public static Session getSession() {
    	
		try {
			if(session == null) {
				session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
			    addTestData();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	return session;
    }

	private static void addTestData() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Victor ", 100000.0D));
		employees.add(new Employee(2, "Kmu Xtal", 200000.0D));
		employees.add(new Employee(3, "El Patron", 150000.0D));
		employees.add(new Employee(4, "El che", 20000.000D));
		
		session.getTransaction().begin();
		for(Employee e: employees) session.save(e);
		session.getTransaction().commit();
	}

}
