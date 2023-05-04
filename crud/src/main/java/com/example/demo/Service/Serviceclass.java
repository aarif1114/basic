package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Modelclass;
import com.example.demo.Repository.Repositoryc;

@Service
public class Serviceclass {
   @Autowired
    Repositoryc rep;
   public List<Modelclass> getmethod()
   {
	   return rep.findAll();
   }
   public Modelclass saveall(Modelclass mc)
   {
	   return rep.save(mc);
   }
   public Modelclass update(Modelclass mc)
   {
	   return rep.saveAndFlush(mc);
   }
public void deleteall(int id) {
	rep.deleteById(id);
	
}
public List<Modelclass> sorting(String name) {
	// TODO Auto-generated method stub
	return rep.findAll(org.springframework.data.domain.Sort.by(name).ascending());
}
public List<Modelclass> page(int num, int size) {
	Page<Modelclass> p=rep.findAll(PageRequest.of(num, size));
	return p.getContent();
}
public List<Modelclass> paginationsorting(int pnum, int psize, String name) {
	// TODO Auto-generated method stub
	Page<Modelclass> p=rep.findAll(PageRequest.of(pnum, psize, org.springframework.data.domain.Sort.by(name).descending()));
	return p.getContent();

}
}
