package com.cgy.server.impl;

import org.springframework.cloud.openfeign.FeignClient;

import com.cgy.api.MemberService;

@FeignClient("cgy-member")
public interface MemberServerImpl extends MemberService{

}
