package test.util;

import org.springframework.stereotype.Component;

// component scan 을 했을때 bean 이 되도록 어노테이션을 붙인다. 
@Component
public class Messenger {
	public void sendGreeting(String msg) {
		System.out.println("전달된 오늘의 인사:"+msg);
	}
	public String getMessage() {
		System.out.println("getMessage() 메소드가 수행 됩니다.");
		return "공부하자!";
	}
}
