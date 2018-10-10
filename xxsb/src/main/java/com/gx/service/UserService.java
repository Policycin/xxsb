package com.gx.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gx.bean.Identity;
import com.gx.bean.User;
import com.gx.bean.UserExample;
import com.gx.bean.UserExample.Criteria;
import com.gx.dao.IdentityMapper;
import com.gx.dao.UserMapper;

@Service
public class UserService {
	
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private IdentityMapper identityMapper;
	
	
	public User login(String username,String password){
		User user=userMapper.selectOne(username);
		if(user!=null&&user.getPermission()>0&&user.getPassword().equals(password)){
			return user;
		}
		
		return null;
	}


	public String checkOne(User user) {
		
		return "ok";
	}


	public void inserOne(User user) {
		userMapper.insertSelective(user);
	}
}
