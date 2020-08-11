package com.gura.spring04;

import org.springframework.web.multipart.MultipartFile;

public class FileDto {
	// <input type="text" name="title"/> 에서
	// name 속성의 value 와 같게 필드명을 지정한다. 
	private String title;
	private String orgFileName;
	private String saveFileName;
	private long fileSize;
	// <input type="file" name="myFile" />  에서
	// name 속성의 value 와 같게 필드명을 지정한다. 
	private MultipartFile myFile;
	
	//생성자
	public FileDto() {}

	public FileDto(String title, String orgFileName, String saveFileName, long fileSize, MultipartFile myFile) {
		super();
		this.title = title;
		this.orgFileName = orgFileName;
		this.saveFileName = saveFileName;
		this.fileSize = fileSize;
		this.myFile = myFile;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrgFileName() {
		return orgFileName;
	}

	public void setOrgFileName(String orgFileName) {
		this.orgFileName = orgFileName;
	}

	public String getSaveFileName() {
		return saveFileName;
	}

	public void setSaveFileName(String saveFileName) {
		this.saveFileName = saveFileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public MultipartFile getMyFile() {
		return myFile;
	}

	public void setMyFile(MultipartFile myFile) {
		this.myFile = myFile;
	}
	
}




