package com.example.demo.service;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.Repository1;

public class Service { 
	@Autowired 
	Repository1 emprepo ;
	@Autowired
	Repository addrepo ;
	
	public String addEmployee(modell emp)

}
