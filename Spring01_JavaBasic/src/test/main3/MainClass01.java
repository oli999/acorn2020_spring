package test.main3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.auto.Car;
import test.auto.Sedan;

public class MainClass01 {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("test/main3/init.xml");
		
		Car c1=context.getBean(Car.class);
		c1.drive();
		
		Sedan s1=context.getBean(Sedan.class);
		s1.showInfo();
	}
}






