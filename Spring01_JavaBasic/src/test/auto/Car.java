package test.auto;

public class Car {
	//필드
	private Engine engine;
	//생성자
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		if(engine==null) {
			System.out.println("Engine 객체가 없어서 달릴수가 없어요");
		}else {
			System.out.println("달려요!");
		}
	}
	
}
