package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// init.xml 문서를 로딩해서 Spring 이 생성할 객체는 생성해서 관리 하도록 한다.
		ApplicationContext context=
				new ClassPathXmlApplicationContext("test/main/init.xml");
		// 관리 하고 있는 객체 중에서 id  가  myWeapon 인 객체의 참조값 얻어와서 
		// 인터페이스 type 으로 casting  한다. 
		Weapon w=(Weapon)context.getBean("myWeapon");
		// 필요한 기능 사용하기 
		w.attack();
	}
}







