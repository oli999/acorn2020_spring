package com.gura.spring04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlTestController {
	@RequestMapping("/xml01")
	public String xml01() {
		
		return "xml01";
	}
	
	@RequestMapping("/xml02")
	@ResponseBody
	public Data xml02() {
		//xml 과 관련된 어노테이션으로 설계된 클래스로 객체를 생성하고 
		Data d=new Data();
		//데이터를 담고 
		d.setNum(1);
		d.setName("김구라");
		//리턴해주면 xml 문서가 응답된다.
		return d;
	}
	
	@RequestMapping("/xml03")
	@ResponseBody
	public HobbyList xml03() {
		List<String> hobby=new ArrayList<>();
		hobby.add("java");
		hobby.add("jsp");
		hobby.add("spring");
		
		HobbyList h=new HobbyList();
		h.setHobby(hobby);
		return h;
	}
}











