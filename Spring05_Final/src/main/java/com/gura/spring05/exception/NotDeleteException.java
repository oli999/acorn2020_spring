package com.gura.spring05.exception;

public class NotDeleteException extends RuntimeException{
	//생성자
	public NotDeleteException(String message) {
		//생성자의 인자로 받은 예외 메세지를 부모생성자에 넘겨준다.
		super(message);
	}
}
