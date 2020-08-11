package com.gura.spring05.users.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

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

	@Override
	public void loginProcess(UsersDto dto, ModelAndView mView, 
			HttpSession session) {
		//dao 객체를 이용해서 id , pwd 가 유효한 정보인지 여부를 얻어낸다. 
		boolean isValid=dao.isValid(dto);
		
		if(isValid) {//만일 유효한 정보이면 
			//로그인 처리를 한다. 
			session.setAttribute("id", dto.getId());
			//view 페이지에서 사용할 정보 
			mView.addObject("isSuccess", true);
		}else {//아니면 
			mView.addObject("isSuccess", false);
		}
	}

	@Override
	public void getInfo(HttpSession session, ModelAndView mView) {
		//로그인된 아이디를 session 객체를 이용해서 얻어온다. 
		String id=(String)session.getAttribute("id");
		//dao 를 이용해서 사용자 정보를 얻어와서 
		UsersDto dto=dao.getData(id);
		//mView 객체에 담아준다. 
		mView.addObject("dto", dto);
	}
	
}







