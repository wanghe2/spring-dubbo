package com.wang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
	@RequestMapping("provideData")
	public String provideData() {
		return "服务提供方获取数据";
	}
}
