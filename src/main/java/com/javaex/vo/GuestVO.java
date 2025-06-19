package com.javaex.vo;

public class GuestVO {
	
	//필드
	private int no;
	private String name;
	private String pw;
	private String content;
	private String date;

	
	
	//생성자
	public GuestVO() {
		super();
	}


	
	
	

	public GuestVO(int no, String pw) {
		super();
		this.no = no;
		this.pw = pw;
	}






	public GuestVO(int no) {
		super();
		this.no = no;
	}






	public GuestVO(String name, String pw, String content) {
		super();
		this.name = name;
		this.pw = pw;
		this.content = content;
	}






	public GuestVO(String name, String pw, String content, String date) {
		super();
		this.name = name;
		this.pw = pw;
		this.content = content;
		this.date = date;
	}





	public GuestVO(int no, String name, String pw, String content, String date) {
		super();
		this.no = no;
		this.name = name;
		this.pw = pw;
		this.content = content;
		this.date = date;
	}

	

	//메소드gs

	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	//메소드일반

	@Override
	public String toString() {
		return "GuestbookVO [no=" + no + ", name=" + name + ", pw=" + pw + ", content=" + content + ", date=" + date
				+ "]";
	}
		
	
	

}
