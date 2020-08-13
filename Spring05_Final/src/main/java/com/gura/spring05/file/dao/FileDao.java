package com.gura.spring05.file.dao;

import java.util.List;

import com.gura.spring05.file.dto.FileDto;

public interface FileDao {
	public List<FileDto> getList(FileDto dto);
	public int getCount(FileDto dto);
}
