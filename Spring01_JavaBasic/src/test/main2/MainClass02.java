package test.main2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		//Spring 프레임워크를 활용해서 아래의 useRemocon() 메소드를 호출해 보세요.
		ApplicationContext context=
				new ClassPathXmlApplicationContext("test/main2/init.xml");
		Remocon r=context.getBean(Remocon.class);
		useRemocon(r);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}



