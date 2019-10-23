package com.wang.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wang.service.UserService;

@RestController
public class ConsumerController {

	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping("getData")
	public String getData() {
		return "消费者获取数据内容为：--"+userService.getUserInfo();
	}
	
}
