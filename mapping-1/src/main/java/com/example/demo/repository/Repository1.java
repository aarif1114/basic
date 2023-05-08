package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.*;

public interface Repository1 extends JpaRepository   <Employee,Integer>{

	@Query(value="Select e FROM Employee e join e.address a"  )
}
