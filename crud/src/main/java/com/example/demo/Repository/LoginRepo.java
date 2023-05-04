package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Login;

public interface LoginRepo extends JpaRepository<Login, Integer> {

	Login findByusername(String username);

}
