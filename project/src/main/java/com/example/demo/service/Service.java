package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Modelclass;
import com.example.demo.repository.Repository;
@org.springframework.stereotype.Service
public class Service {
   @Autowired
   Repository rep;

public List<Modelclass> get() {
	// TODO Auto-generated method stub
	return rep.findAll();
}

public Modelclass savedetails(Modelclass mc) {
	// TODO Auto-generated method stub
	return rep.save(mc);
}
}
