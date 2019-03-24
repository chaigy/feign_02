package com.cgy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgy.server.impl.MemberServerImpl;

@RestController
public class OrderController {
	
	@Autowired
	private MemberServerImpl se;
	
	@RequestMapping("/get")
	public String get() {
		return se.getMember();
	}
}
