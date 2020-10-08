package com.example.helloweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	
	@RequestMapping("/fortune")
	public ModelAndView fortune(ModelAndView mView) {
		mView.addObject("fortuneToday", "동쪽으로 가면 귀인을 만나요");
		mView.setViewName("fortune");
		return mView;
	}
}
