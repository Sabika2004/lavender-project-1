package com.Lavender.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Lavender.demo.service.LoginService;



@RestController
public class LoginController {
	
	@Autowired
	LoginService loginser;
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username=loginDataMap.get("username");
		String password=loginDataMap.get("password");
		String result=loginser.loginCheckData(username,password);
		return result;
	}

}
