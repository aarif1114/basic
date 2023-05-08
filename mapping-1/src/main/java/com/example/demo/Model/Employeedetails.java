package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
  
@GeneratedValue(Strategy)

@Entity

public class Employeedetails {
	
	@Id
	private int id ;
	private String gender ;
	private String salary ;
	private String destination ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	

}
