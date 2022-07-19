package com.edu;

public class SwimMember  extends Member{
	// 강습반의 강사이름. 필드
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A toString()
	
private String swName;
private String grade;
	
	public SwimMember() {
		super();
	}
	
	public SwimMember(int memberId, String memberName, String phone, String swName, String grade){
		super(memberId, memberName, phone);
		this.swName = swName;
		this.grade = grade;				
	}
	
	//get set
	public String getSwName() {
		return swName;
	}

	public String getGrade() {
		return grade;
	}

	public void setSwName(String swName) {
		this.swName = swName;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "SwimMember [아이디=" + getMemberId() + " 이름=" + getMemberName() + ", 전화번호=" + getPhone() + "수영반강사이름=" + swName + "등급= " + grade+ "]";
	}
	 
	 
	 
	 
}
