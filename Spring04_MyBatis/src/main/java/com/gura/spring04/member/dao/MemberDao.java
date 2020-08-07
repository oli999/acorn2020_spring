package com.gura.spring04.member.dao;

import java.util.List;

import com.gura.spring04.member.dto.MemberDto;

// dao 가 구현할 인터페이스를 미리 정의 한다. 
public interface MemberDao {
	public void insert(MemberDto dto);
	public void update(MemberDto dto);
	public void delete(int num);
	public MemberDto getData(int num);
	public List<MemberDto> getList();
}






