package test.main2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.mypac.Weapon;


public class MainClass {
	public static void main(String[] args) {
		
		//아래의 메소드를 호출하는게 프로그래밍의 목적이라면?
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("test/main2/init.xml");
		
		// Spring Bean Container 에서 Weapon type 의 참조값 얻어오기
		Weapon w=context.getBean(Weapon.class);
	
		useWeapon(w);
	}
	
	public static void useWeapon(Weapon w) {
		w.attack();
	}
}








