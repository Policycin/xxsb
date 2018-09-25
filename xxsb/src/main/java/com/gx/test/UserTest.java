package com.gx.test;

import java.util.Date;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gx.bean.Identity;
import com.gx.bean.User;
import com.gx.dao.IdentityMapper;
import com.gx.dao.UserMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserTest {
	@Autowired
	IdentityMapper identityMapper;
	@Autowired
	SqlSession sqlSession;
	@Autowired
	UserMapper userMapper;
	@Test
	public void TestSelect(){
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		User selectByPrimaryKey = mapper.selectOne("admin");
		System.out.println(selectByPrimaryKey);
		
	}
	
	public void testCRUD(){
		
		IdentityMapper mapper=sqlSession.getMapper(IdentityMapper.class);
		Identity identity=new Identity();
		UUID uuid=UUID.randomUUID();
		String str=uuid.toString();
		identity.setIdentity(str);
		Date date=new Date();
		identity.setCreateTime(date); 
		identity.setUnit("中国国信信息总公司");
		mapper.insertSelective(identity);
		
		System.out.println("insert success");
	}
	
	public void testUser(){
		User user=new User();
		user.setUsername("admin");
		user.setPassword("123456");
		user.setEmail("xinruiqian@sic.gov.cn");
		user.setCreateTime(new Date());
		user.setIdentityId(1);
		user.setPermission(3);
		user.setPhone("15210349477");
		user.setRealName("辛瑞乾");
		user.setLastLoginTime(new Date());
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		mapper.insertSelective(user);
		System.out.println("insert success");
	}

}
