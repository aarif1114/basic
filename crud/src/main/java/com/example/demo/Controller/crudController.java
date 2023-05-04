package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Modelclass;
import com.example.demo.Service.Serviceclass;

@RestController
public class crudController {
	
	
   @Autowired
   Serviceclass cont;
   @GetMapping("/get")
   public List<Modelclass> get()
   {
	   return cont.getmethod();
   }
   @PostMapping("/post")
   public Modelclass saveall1(@RequestBody Modelclass mc)
   {
	   return cont.saveall(mc);
   }
   @PutMapping("/put")
   public Modelclass Updatedetails(@RequestBody Modelclass mc)
   {
	   return cont.update(mc);
   }
   @DeleteMapping("/delete/{id}")
   public String Deleteoption(@PathVariable int id)
   {
	  cont.deleteall(id);
	  return "deleted";	  
   }
   @GetMapping("/sort/{name}")
	public List<Modelclass> sorting(@PathVariable("name")String name)
	{
		 return cont.sorting(name);
	}
	
	//pagination
	@GetMapping("/page/{pnum}/{psize}")
	public List<Modelclass> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
	{
		return cont.page(num,size);
	}
	
	//pagination sorting
	@GetMapping("/paginationsort/{pnum}/{psize}/{name}")
	public List<Modelclass> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)
	{
		return cont.paginationsorting(pnum,psize,name);
	}
   
}
