package com.gura.spring04.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring04.member.dto.MemberDto;

// dao 를 bean 으로 만들기 위한 어노테이션(spring 이 관리하는 객체를 만들기 위한 어노테이션) 
@Repository
public class MemberDaoImpl implements MemberDao{
	//의존 객체 주입 받기(Dependency Injection)
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(MemberDto dto) {
		/*
		 *  mapper namespace : member
		 *  sql id : insert
		 *  parameterType : MemberDto
		 */
		session.insert("member.insert", dto);
	}

	@Override
	public void update(MemberDto dto) {
		/*
		 *  mapper namespace : member
		 *  sql id : update
		 *  parameterType : MemberDto
		 */
		session.update("member.update", dto);
	}

	@Override
	public void delete(int num) {
		/*
		 *  mapper namespace: member
		 *  sql id : delete
		 *  parameterType : int or java.lang.Integer
		 */
		session.delete("member.delete", num);
	}

	@Override
	public MemberDto getData(int num) {
		/*
		 *  mapper namespace : member
		 *  sql id : getData
		 *  parameterType : int
		 *  resultType : MemberDto 
		 *  - resultType 은 select 된 row 하나를 담을 데이터를 type 을 의미한다.
		 *  - selectOne() 메소드는 resultType 을 리턴해 준다. 
		 */
		MemberDto dto=session.selectOne("member.getData", num);
		return dto;
	}

	@Override
	public List<MemberDto> getList() {
		/*
		 *  resultType : MemberDto
		 *  - resultType 은 select 된 row 하나를 담을 데이터를 type 을 의미한다.
		 *  - selectList() 메소드는 List type 을 리턴하고 List 의 generic type
		 *  이 resultType 이 된다. 
		 */
		List<MemberDto> list=session.selectList("member.getList");
		return list;
	}
	
}






