package com.Lavender.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lavender.demo.Model.LoginModel;
import com.Lavender.demo.repository.LoginRepository;
@Service
public class LoginService {
	
	
	@Autowired
	LoginRepository lr;
	public String loginCheckData(String username,String password)
	{
		LoginModel user = lr.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
}
