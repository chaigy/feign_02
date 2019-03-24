package com.cgy.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface MemberService {

	@RequestMapping("/member")
	public String getMember();
}
