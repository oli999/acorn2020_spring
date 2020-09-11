package com.gura.spring05;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;


@Controller
public class TestController {
	
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






















