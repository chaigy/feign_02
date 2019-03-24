package com.cgy.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/member")
	public String getMember() {
		return "我是member提供服务::::"+port;
	}
}
