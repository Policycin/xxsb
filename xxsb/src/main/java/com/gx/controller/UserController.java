package com.gx.controller;

import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gx.bean.User;
import com.gx.service.UserService;


@SessionAttributes({"user"})
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	@Autowired
	private ResourceBundleMessageSource messageSource;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam(value="username")String username,
			@RequestParam(value="password")String password,
			Map<String,Object>map,RedirectAttributes attributes,
			Locale locale){
		User user = userService.login(username, password);
		System.out.println("控制器验证");
		if(user!=null){
			map.put("user", user);
			return "success";
		}
		String message=messageSource.getMessage("error.xxsb.user.login", null, locale);
		attributes.addFlashAttribute("message", message);
		attributes.addFlashAttribute("name", username);
		return "redirect:/index";
//		return "fail";

	}
	

		
}






