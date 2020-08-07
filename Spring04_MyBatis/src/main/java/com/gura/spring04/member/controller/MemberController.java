package com.gura.spring04.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.member.dao.MemberDao;
import com.gura.spring04.member.dto.MemberDto;

@Controller
public class MemberController {
	//의존객체를 주입 받는다.
	@Autowired
	private MemberDao dao;
	
	//회원 추가 요청처리
	@RequestMapping("/member/insert")
	public String insert(MemberDto dto) {
		//회원 정보를 DB 에 저장하고
		dao.insert(dto);
		//view page 로 forward 이동해서 응답
		return "member/insert";
	}
	
	//회원추가 폼 요청 처리
	@RequestMapping("/member/insertform")
	public String insertform() {
		//수행할 비즈니스 로직은 현재 없다.
		
		return "member/insertform";
	}
	
	@RequestMapping("/member/list")
	public ModelAndView list(ModelAndView mView) {
		//회원목록을 얻어온다.
		List<MemberDto> list=dao.getList();
		//model 을 담는다
		mView.addObject("list", list);
		//view 페이지 정보를 담고 
		mView.setViewName("member/list");
		//ModelAndView 객체를 리턴해 준다.
		return mView;
	}
}





