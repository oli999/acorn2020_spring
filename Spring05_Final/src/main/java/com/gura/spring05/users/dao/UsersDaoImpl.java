package com.gura.spring05.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao{
	@Autowired
	private SqlSession session;

	@Override
	public boolean isExist(String inputId) {
		//입력한 아이디가 존재하는지 id 를 select 해 본다.
		String id=session.selectOne("users.isExist", inputId);
		
		if(id==null) {//존재하지 않는 아이디
			return false;
		}else {//존재하는 아이디
			return true;
		}
	}

	@Override
	public void insert(UsersDto dto) {
		session.insert("users.insert", dto);
	}

	@Override
	public boolean isValid(UsersDto dto) {
		String id=session.selectOne("users.isValid", dto);
		if(id==null) {
			return false;
		}else {
			return true;
		}
	}
	
	//인자로 전달되는 id 에 해당되는 사용자 정보를 리턴하는 메소드 
	@Override
	public UsersDto getData(String id) {
		UsersDto dto=session.selectOne("users.getData", id);
		return dto;
	}
	
}








