package com.edu;

public class BookMember  extends Member{
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)필드추가
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 기본정보+추가정보 toString오버라읻딩
private String boName;
private String classroom;	
	
	public BookMember() {
		super();
	}
	
	public BookMember(int memberId, String memberName, String phone,String boName, String classroom){
		super(memberId, memberName, phone);
		this.boName=boName;
		this.classroom = classroom;
				
	}
	
	// get set
	public String getBoName() {
		return boName;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setBoName(String boName) {
		this.boName = boName;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "BookMember [아이디=" + getMemberId() + " 이름=" + getMemberName() + " 전화번호=" + getPhone() + " 도서반방장이름=" + boName + " 강의실=" + classroom+ "]";
	}

	 
	
	
	
}
