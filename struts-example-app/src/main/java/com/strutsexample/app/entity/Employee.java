package com.strutsexample.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	Integer id;
	String fullName;
	Double salary;
	
	
	
	public Employee() {
		super();
	}
	
	public Employee(Integer id, String fullName, Double salary) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
