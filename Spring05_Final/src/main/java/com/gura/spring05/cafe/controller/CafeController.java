package com.gura.spring05.cafe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.cafe.dto.CafeDto;
import com.gura.spring05.cafe.service.CafeService;

@Controller
public class CafeController {
	@Autowired
	private CafeService cafeService;
	//카페 글 목록 보기 요청 처리 
	@RequestMapping("/cafe/list")
	public ModelAndView getList(HttpServletRequest request, 
			ModelAndView mView) {
		cafeService.getList(request);
		mView.setViewName("cafe/list");
		return mView;
	}
	
	@RequestMapping("/cafe/detail")
	public ModelAndView detail(HttpServletRequest request,
			ModelAndView mView) {
		cafeService.getDetail(request);
		mView.setViewName("cafe/detail");
		return mView;
	}
	
	@RequestMapping("/cafe/private/insertform")
	public ModelAndView insertForm(ModelAndView mView) {
		
		mView.setViewName("cafe/insertform");
		return mView;
	}
	
	@RequestMapping(value = "/cafe/private/insert", method=RequestMethod.POST)
	public ModelAndView insert(CafeDto dto, ModelAndView mView, HttpSession session) {
		//dto 에 글 작성자 담기 
		String id=(String)session.getAttribute("id");
		dto.setWriter(id);
		cafeService.saveContent(dto);
		mView.setViewName("cafe/insert");
		return mView;
	}
	
	@RequestMapping("/cafe/private/updateform")
	public ModelAndView updateform(HttpServletRequest request,
			ModelAndView mView) {
		cafeService.getDetail(request);
		mView.setViewName("cafe/updateform");
		return mView;
	}
	@RequestMapping(value="/cafe/private/update", method=RequestMethod.POST)
	public ModelAndView update(CafeDto dto, ModelAndView mView) {
		cafeService.updateContent(dto);
		mView.setViewName("cafe/update");
		return mView;
	}
	@RequestMapping("/cafe/private/delete")
	public ModelAndView delete(int num, HttpServletRequest request,
			ModelAndView mView) {
		cafeService.deleteContent(num, request);
		mView.setViewName("redirect:/cafe/list.do");
		return mView;
	}
	@RequestMapping(value = "/cafe/private/comment_insert", 
			method=RequestMethod.POST)
	public ModelAndView commentInsert(HttpServletRequest request,
			ModelAndView mView, @RequestParam int ref_group) {
		//새 댓글을 저장하고 
		cafeService.saveComment(request);
		//보고 있던 글 자세히 보기로 다시 리다일렉트 이동 시킨다.
		mView.setViewName("redirect:/cafe/detail.do?num="+ref_group);
		return mView;
	}
}






