package com.gura.spring05.exception;
/*
 *  일반적인 예외 클래스는 RuntimeException 클래스를 상속 받아서 만든다.
 *  - 생성자의 인자로 예외 메세지를 전달 받아서 부모 생성자에 넘겨주면
 *    .getMessage() 메소드를 호출할때 예외 넘겨주었던 예외 메세지가 리턴된다. 
 */
public class NotDeleteException extends RuntimeException{
	//생성자
	public NotDeleteException(String message) {
		//생성자의 인자로 받은 예외 메세지를 부모생성자에 넘겨준다.
		super(message);
	}
}












