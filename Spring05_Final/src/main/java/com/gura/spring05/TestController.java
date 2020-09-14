package com.gura.spring05;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gura.spring05.users.dto.UsersDto;
import com.gura.spring05.users.service.UsersService;


@Controller
public class TestController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/api/jsonp_login")
	@ResponseBody
	public JSONPObject jsonpLogin(String callback, UsersDto dto) {
		//유효한 정보인지 여부를 얻어온다. 
		boolean isValid=usersService.jsonpLogin(dto);
		//유효한지 여부를 Map 에 담고
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("isValid", isValid);
		//JSONPObject 객체에 담아서 
		JSONPObject jp=new JSONPObject(callback, map);
		return jp; //리턴해준다. 
	}
	
	
	@RequestMapping("/api/get_info")
	@ResponseBody
	public JSONPObject jsonp(@RequestParam(defaultValue="callback") String callback) {
		//클라이언트에게 응답할 데이터를 Map 에 담는다.
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		//JSONPObject 객체를 생성해서 콜백 함수명과 응답할 데이터를 담고 
		JSONPObject jp=new JSONPObject(callback, map);
		//JSONPObject 를 리턴해준다. 
		return jp;
	}
}






















