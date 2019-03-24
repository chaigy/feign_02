package com.cgy.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderServer {


	@RequestMapping("/get")
	public String get();
}
