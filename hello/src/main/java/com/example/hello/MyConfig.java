package com.example.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hello.mypac.Car;
import com.example.hello.mypac.MemberDto;

@Configuration
public class MyConfig {
	// <bean  id="myCar"  class="com.example.hello.mypac.Car" />
	@Bean
	public Car myCar() {
		return new Car();
	}
	@Bean
	public MemberDto myMember() {
		
		return new MemberDto();
	}
}










