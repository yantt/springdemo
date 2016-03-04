package com.zwtxsy.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zwtxsy.entity.vo.User;
import com.zwtxsy.mapper.UserMapper;
import com.zwtxsy.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Resource 
	private UserMapper userMapper;
	
	@Transactional(rollbackFor=Exception.class)
	public User selectOneUser() {
		//userMapper.updateOneUser();
		//userMapper.insertOneUser();
		return userMapper.selectOneUser();
	}

	public String selectUserName(){
		return userMapper.selectUserName();
	}
}
