package com.cgy.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface MemberService {

	@RequestMapping("/member")
	public String getMember(@RequestParam("name") String name);
}
