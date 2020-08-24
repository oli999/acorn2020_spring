package com.gura.spring05.aspect;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Aspect
@Component
public class TimeAspect {
	
	@Around("execution(* com.gura.spring05.file.controller.*.*(..))")
	public Object checkTime(ProceedingJoinPoint joinPoint) throws Throwable {
		//로그를 출력할 객체의 참조값 얻어오기 
		//jointPoint.getTarget().getClass() => aop 가 적용된 클래스의 type
		Logger logger=
				LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		logger.info("요청 처리 시작!");
		//시작시간 (ms)
		long startTime=System.currentTimeMillis();

		Object obj=joinPoint.proceed(); //aop 가 적용된 메소드 수행하기 
		//끝시간 (ms)
		long endTime=System.currentTimeMillis();
		//시작과 끝의 차이를 얻어낸다. 
		long time=endTime-startTime;
		logger.info("time:"+time);
		logger.info("요청 처리 끝!");
		
		return obj;
	}
}




