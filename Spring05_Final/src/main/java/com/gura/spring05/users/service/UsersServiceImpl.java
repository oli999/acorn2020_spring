package com.gura.spring05.users.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gura.spring05.users.dao.UsersDao;
import com.gura.spring05.users.dto.UsersDto;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersDao dao;

	@Override
	public Map<String, Object> isExistId(String inputId) {
		//dao 를 이용해서 아이디 존재 여부를 알아내서 
		boolean isExist=dao.isExist(inputId);
		//아이디가 존재하는지 여부를 Map 에 담아서 리턴해 준다. 
		Map<String, Object> map=new HashMap<>();
		map.put("isExist", isExist);
		return map;
	}

	@Override
	public void addUser(UsersDto dto) {
		//dao  객체를 이용해서 새로운 사용자 정보를 DB 에 저장하기 
		dao.insert(dto);
	}
	
}







