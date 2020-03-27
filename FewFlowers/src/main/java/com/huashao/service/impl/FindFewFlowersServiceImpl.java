package com.huashao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huashao.dao.FindFewFlowersMappeer;
import com.huashao.pojo.FewFlowersLogin;
import com.huashao.service.FindFewFlowersService;

@Service
public class FindFewFlowersServiceImpl implements FindFewFlowersService{

	@Autowired
	private FindFewFlowersMappeer findFewFlowersMappeer;

	@Override
	public List<FewFlowersLogin> findFewFlowersLogin() {
		return findFewFlowersMappeer.findFewFlowersLogin();
	}

	@Override
	public int updateFewFlowersLogin(Integer login_id) {
		return findFewFlowersMappeer.updateFewFlowersLogin(login_id);
	}
}
