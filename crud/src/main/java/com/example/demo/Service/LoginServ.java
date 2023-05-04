package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Login;
import com.example.demo.Repository.LoginRepo;

@Service
public class LoginServ {
@Autowired
public LoginRepo lr;
public String checkLogin(String username,String password)
{
	Login ss=lr.findByusername(username);
	if(ss==null)
	{
		return "No User Found";
	}
	else
	{
		if(ss.getPassword().equals(password))
		{
			return "Login Successfull";
		}
		else
		{
			return "Login Failed";
		}
	}
	
}
public Login AddUser(Login n)
{
	return lr.save(n);
}
public List<Login> getUser()
{
	return lr.findAll();
}
}
