package test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessengerAspect {
	// return type 은 void 이고 send로 시작하는 모든 메소드가 point cut 이다.
	@Around("execution(void send*(..))")
	public void checkGreeting(ProceedingJoinPoint joinPoint) 
				throws Throwable{
		//aop 가 적용된 메소드 수행하기 이전에 해야할 작업 
		//메소드에 전달된 인자들 목록을 얻어내기
		Object[] args=joinPoint.getArgs();
		for(Object tmp:args) {
			//만일 인자가 String type  이면
			if(tmp instanceof String) {
				//원래 type 으로 casting
				String msg=(String)tmp;
				System.out.println("aspect 에서 읽어낸 내용:"+msg);
				if(msg.contains("바보")) {
					System.out.println("바보는 금지된 단어 입니다.");
					return; //메소드를 여기서 끝내기 (proceed() 가 호출이 안된다)
				}
			}
		}
		
		joinPoint.proceed(); // aop 가 적용된 메소드 수행하기 
		
		//aop 가  적용된 메소드 수행된 이후에 해야할 작업 
	}
	
	@Around("execution(String get*())")
	public Object checkReturn(ProceedingJoinPoint joinPoint) throws Throwable {
		
		//aop 가 적용된 메소드가 리턴하는 데이터 얻어내기 
		Object obj=joinPoint.proceed();
		
		//aop 가 적용된 메소드가 리턴하는 데이터 
		return "놀자 놀자~";
	}
}













