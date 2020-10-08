package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.hello.mypac.MemberDto;

@SpringBootApplication
public class HelloApplication2 {

	public static void main(String[] args) {
		System.out.println("app 이 시작 됩니다.");
		//Spring app 을 실행시키고 ApplicationContext type 의 참조값 리턴 받기 
		ApplicationContext context=SpringApplication.run(HelloApplication2.class, args);
		
		MemberDto dto=context.getBean(MemberDto.class);
		
		System.out.println(dto.getNum()+"|"+dto.getName()+"|"+dto.getAddr());
	}

}







