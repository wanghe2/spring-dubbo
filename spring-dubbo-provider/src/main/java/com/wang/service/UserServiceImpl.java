package com.wang.service;

import org.springframework.stereotype.Service;

import com.wang.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{

	@Override
	public String getUserInfo() {
		return "服务提供者实现接口内容";
	}
}
