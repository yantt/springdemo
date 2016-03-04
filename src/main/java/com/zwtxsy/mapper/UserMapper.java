package com.zwtxsy.mapper;

import com.zwtxsy.entity.vo.User;

public interface UserMapper {

	Integer updateOneUser();
	Integer insertOneUser();
	User selectOneUser();
	String selectUserName();
}
