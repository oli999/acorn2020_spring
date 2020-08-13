package com.gura.spring05.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.file.dto.FileDto;

@Repository
public class FileDaoImpl implements FileDao{
	@Autowired
	private SqlSession session;
	
	//파일 목록을 리턴하는 메소드 
	public List<FileDto> getList(FileDto dto){
		List<FileDto> list=session.selectList("file.getList", dto);
		return list;
	}
	
	//검색 키워드에 맞는 row 의 갯수를 리턴하는 메소드 
	@Override
	public int getCount(FileDto dto) {
		return session.selectOne("file.getCount", dto);
	}
	//파일 정보를 저장하는 메소드 
	@Override
	public void insert(FileDto dto) {
		session.insert("file.insert", dto);
	}
	
}



