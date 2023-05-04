package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Login;
import com.example.demo.Service.LoginServ;

@RestController
@RequestMapping("/Login")
public class LoginController {
@Autowired
LoginServ ls;
@PostMapping("/check")
public String LoginCheck(@RequestBody Map<String,String>Logindata)
{
	String username=Logindata.get("username");
	String password=Logindata.get("password");
	String result=ls.checkLogin(username, password);
	return result;
}
@PostMapping("/adddetail")
public Login AddUser(@RequestBody Login Login)
{
	return ls.AddUser(Login);
}
@GetMapping
public List<Login> ListAll()
{
	return ls.getUser();
}
}
