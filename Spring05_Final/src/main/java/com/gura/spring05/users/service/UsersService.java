package com.gura.spring05.users.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.users.dto.UsersDto;

public interface UsersService {
	public Map<String, Object> isExistId(String inputId);
	public void addUser(UsersDto dto);
	public void loginProcess(UsersDto dto, ModelAndView mView,
			HttpSession session);
	public void getInfo(HttpSession session, ModelAndView mView);
	public void deleteUser(HttpSession session);
	public Map<String, Object> saveProfileImage(HttpServletRequest request,
			MultipartFile mFile);
}








