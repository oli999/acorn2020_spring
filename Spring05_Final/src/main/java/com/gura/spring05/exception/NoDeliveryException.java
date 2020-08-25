package com.gura.spring05.exception;

import org.springframework.dao.DataAccessException;
/*
 *  트랜젝션 관리에 영향을 주는 예외를 발생 시키기 위해서 DataAccessException 
 *  클래스를 상속 받아서 클래스를 정의 한다. 
 */
public class NoDeliveryException extends DataAccessException{

	public NoDeliveryException(String msg) {
		super(msg);
	}

}
