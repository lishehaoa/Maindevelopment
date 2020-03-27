package com.huashao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huashao.dao.FewFlowersLoginMapper;
import com.huashao.pojo.FewFlowersLogin;
import com.huashao.service.FewFlowersLoginService;

@Service
public class FewFlowersLoginServiceImpl implements FewFlowersLoginService{

	@Autowired
	private FewFlowersLoginMapper fewFlowersLoginMapper;
	
	@Override
	public int register(String login_username, String login_password, String login_status,
			String login_registrationtime) {
		return fewFlowersLoginMapper.register(login_username, login_password, login_status, login_registrationtime);
	}

	@Override
	public int findLoginUserName(String login_username) {
		return fewFlowersLoginMapper.findLoginUserName(login_username);
	}

	@Override
	public FewFlowersLogin login(String login_username,String login_password) {
		return fewFlowersLoginMapper.login(login_username);
	}

}
