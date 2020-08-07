package com.gura.spring04.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.member.dao.MemberDao;
import com.gura.spring04.member.dto.MemberDto;

@Controller
public class MemberController {
	//의존객체를 주입 받는다.
	@Autowired
	private MemberDao dao;
	
	//POST 방식 /member/update 요청 처리
	@RequestMapping(value = "/member/update", method=RequestMethod.POST)
	public String update(@ModelAttribute MemberDto dto) {
		dao.update(dto);
		return "member/update";
	}
	
	
	// GET 방식 /member/updateform 요청 처리 
	@RequestMapping(value = "/member/updateform",
			method = RequestMethod.GET)
	public ModelAndView updateform(@RequestParam int num,
			ModelAndView mView) {
		//dao 를 이용해서 수정할 회원의 정보를 얻어온다.
		MemberDto dto=dao.getData(num);
		//model 을 ModelAndView 객체에 담는다.
		mView.addObject("dto", dto);
		//view 페이지 정보를 ModelAndView 객체에 담는다.
		mView.setViewName("member/updateform");
		//ModelAndView 객체를 리턴해준다.
		return mView;
	}
	
	//회원 삭제 요청 처리
	@RequestMapping("/member/delete")
	public String delete(@RequestParam int num) {
		dao.delete(num);
		//리다일렉트 응답
		return "redirect:/member/list.do";
	}
	
	//회원 추가 요청처리
	@RequestMapping("/member/insert")
	public String insert(@ModelAttribute MemberDto dto) {
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





