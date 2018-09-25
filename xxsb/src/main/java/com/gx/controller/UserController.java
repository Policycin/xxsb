package com.gx.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gx.bean.User;
import com.gx.service.UserService;


@SessionAttributes({"user"})
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam(value="username")String username,@RequestParam(value="password")String password,Map<String,Object>map){
		User user = userService.login(username, password);
		System.out.println("控制器验证");
		if(user!=null){
			map.put("user", user);
			return "success";
		}
//		return "redirect:/index.jsp";
		return "fail";

	}
	

		
}






