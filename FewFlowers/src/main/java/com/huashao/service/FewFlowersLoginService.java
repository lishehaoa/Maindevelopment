package com.huashao.service;

import org.apache.ibatis.annotations.Param;

import com.huashao.pojo.FewFlowersLogin;

public interface FewFlowersLoginService {

	public int register(@Param("login_username") String login_username,
			@Param("login_password") String login_password,
			@Param("login_status") String login_status,
			@Param("login_registrationtime") String login_registrationtime);
	
	public int findLoginUserName(@Param("login_username") String login_username);
	
	public FewFlowersLogin login(@Param("login_username") String login_username,
			@Param("login_password") String login_password);
	
}
