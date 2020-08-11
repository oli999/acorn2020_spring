package com.gura.spring05.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gura.spring05.users.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;
	
	//회원 가입 폼 요청 처리 
	@RequestMapping("/users/signup_form")
	public String signupForm() {
		
		// /WEB-INF/views/users/signup_form.jsp 페이지로 forward 이동해서 응답
		return "users/signup_form";
	}
}




