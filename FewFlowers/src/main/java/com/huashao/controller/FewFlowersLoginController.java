package com.huashao.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huashao.pojo.FewFlowersLogin;
import com.huashao.service.FewFlowersLoginService;
import com.huashao.util.MD5;

@Controller
public class FewFlowersLoginController {

	@Autowired
	private FewFlowersLoginService fewFlowersLoginService;
	
	@RequestMapping("/tohuashao")
	public String tohuashao() {
		return "huashao";
	}
	@RequestMapping("/tohomepage")
	public String tohomepage() {
		return "homepage";
	}
	
	@RequestMapping("/toregister")
	public String toregister() {
		return "register";
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public int register(@RequestParam("login_username") String login_username,
			@RequestParam("login_password") String login_password,
			@RequestParam("login_status") String login_status,
			@RequestParam("login_registrationtime") String login_registrationtime) {
		
		//1.获取注册时间
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = dateFormat.format(date);
		
		//2.注册密码加密
		String md5_password = MD5.MD5(login_password);
		
		//3.查询用户注册的手机号是否存在
		int loginUserName = fewFlowersLoginService.findLoginUserName(login_username);
		
		//4.条件判断
		int message;
		if(login_username.length() == 0 || login_password.length() == 0) {
			message = 1;
		}else if(login_username.length() < 11) {
			message = 2;
		}else if(login_password.length() < 6) {
			message = 3;
		}else if(loginUserName == 0) {
			fewFlowersLoginService.register(login_username, md5_password, "1", format);
			message = 4;
		}else {
			message = 0;
		}
		return message;
	}
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public int login(@RequestParam("login_username") String login_username,
			@RequestParam("login_password") String login_password) {
		
		//1.登录密码解密
		String md5_password = MD5.MD5(login_password);
		FewFlowersLogin flowersLogin = fewFlowersLoginService.login(login_username, md5_password);
		//2.条件判断
		int message;
		if(login_username.length() == 0 || login_password.length() == 0) {
			message = 1;
		}else if(login_username.length() < 11) {
			message = 2;
		}else if(login_password.length() < 6) {
			message = 3;
		}else if(flowersLogin == null || "".trim().equals(flowersLogin)) {
			message = 4;
		}else if(flowersLogin.getLogin_status().equals("2")){
			message = 5;
		}else if(flowersLogin != null & !(flowersLogin.getLogin_password().equals(md5_password))) {
			message = 6;
        }else if (flowersLogin != null & flowersLogin.getLogin_password().equals(md5_password)){
        	message = 7;
        }else {
			message = 0;
		}
		return message;
	}
}
