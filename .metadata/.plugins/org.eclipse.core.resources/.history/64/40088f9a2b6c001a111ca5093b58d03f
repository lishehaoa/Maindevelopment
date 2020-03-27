package com.huashao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huashao.pojo.FewFlowersLogin;
import com.huashao.service.FindFewFlowersService;

@Controller
public class FindFewFlowersController {

	@Autowired
	private FindFewFlowersService findFewFlowersService;
	
	@RequestMapping("/toFindFewFlowers")
	public String FindFewFlowers(Model model){
		List<FewFlowersLogin> fewFlowersLogin = findFewFlowersService.findFewFlowersLogin();
		model.addAttribute("fewFlowersLogin", fewFlowersLogin);
		return "findFewFlowers";
	}
}
