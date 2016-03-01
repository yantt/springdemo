package com.zwtxsy.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zwtxsy.entity.vo.User;
import com.zwtxsy.mapper.UserMapper;
import com.zwtxsy.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Resource 
	private UserMapper userMapper;
	
	public User selectOneUser() {
		return userMapper.selectOneUser();
	}

}
