package com.gura.spring05.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//예외 컨트롤러를 bean 으로 만들기 위한 어노테이션 
@ControllerAdvice
public class ExceptionController {
	
	//spring framework 가 동작하는 중에 NotDeleteException type 의 
	//예외가 발생하면 호출되는 메소드 
	@ExceptionHandler(NotDeleteException.class)
	public ModelAndView notDelete(NotDeleteException nde) {
		//해당 오류가 발생했을때 원하는 작업을 한후 
		
		//view page 로 forward 이동해서 예외 정보를 응답한다. 
		ModelAndView mView=new ModelAndView();
		//exception  이라는 키값으로 예외 객체를 담고 
		mView.addObject("exception", nde);
		// /WEB-INF/views/error/info.jsp 페이지로 forward 이동 
		mView.setViewName("error/info");
		return mView;
	}
	/*  @Repository 어노테이션이 붙은 
	 *  Dao 에서 DB 관련 작업을 하다가 예외가 발생하면 실행순서가 여기로 들어온다. 
	 */
	@ExceptionHandler(DataAccessException.class)
	public ModelAndView dataAccess(DataAccessException dae) {
		ModelAndView mView=new ModelAndView();
		mView.addObject("exception", dae);
		mView.setViewName("error/data_access");
		return mView;
	}
}










