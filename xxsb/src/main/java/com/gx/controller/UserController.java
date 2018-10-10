package com.gx.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gx.bean.Identity;
import com.gx.bean.User;
import com.gx.bean.UserExample.Criteria;
import com.gx.dao.IdentityMapper;
import com.gx.service.UserService;


@SessionAttributes({"user"})
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	@Autowired
	private ResourceBundleMessageSource messageSource;
	@Autowired
	private IdentityMapper identityMapper;
	/***
	 * 用户登陆验证
	 * @param username
	 * @param password
	 * @param map
	 * @param attributes
	 * @param locale
	 * @return
	 */
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
	/***
	 * 用户注册验证码验证
	 * 
	 * @param identity
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/reg")
	public String reg(@Valid Identity identity,Model model){
		Identity localIdentity = identityMapper.selectByIdentity(identity.getIdentity());
		model.addAttribute("identity", identity.getIdentity());
		if(localIdentity!=null){
			model.addAttribute("unit", localIdentity.getUnit());
			model.addAttribute("identityId", localIdentity.getId());
		}
		return "register";
	}
	/**
	 * 新用户注册
	 * @param user
	 * @param attributes
	 * @param identity
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public String register(@Valid User user,BindingResult result){
		if(result.hasErrors()){
			return "fail";
		}else{
			Date date=new Date();
			if(userService.checkOne(user)=="ok"){
				user.setCreateTime(date);
				user.setLastLoginTime(date);
				user.setIsDeletable(1);
				user.setIsDownloadable(1);
				user.setIsUpdatable(1);
				user.setIsUploadable(1);
				user.setIsVisible(1);
				user.setMaxOnline(5);
				user.setPermission(1);
				userService.inserOne(user);
			}
			return "register success";
			
		}
	}
}






