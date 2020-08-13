package com.gura.spring05.file.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.file.service.FileService;

@Controller
public class FileController {
	@Autowired
	private FileService fileService;
	
	//파일 목록 보기 요청 처리 
	@RequestMapping("/file/list")
	public ModelAndView list(HttpServletRequest request,
			ModelAndView mView) {
		//fileService 를 이용해서 비즈니스 로직 처리하고 
		fileService.getList(request);
		//view 페이지로 forward 이동해서 응답 하기 
		mView.setViewName("file/list");
		return mView;
	}
	
}





