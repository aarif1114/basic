package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Modelclass;
import com.example.demo.service.Service;

@RestController
public class Controller {
@Autowired
public Service ser;
      @GetMapping("/get")
      public List<Modelclass> getmethod()
      {
    	  return ser.get();
      }
      @PostMapping("/post")
      public Modelclass savedetail(@RequestBody Modelclass mc)
      {
    	  return ser.savedetails(mc); 
      }
}
