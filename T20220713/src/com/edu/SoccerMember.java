package com.edu;

public class SoccerMember extends Member {
	
	// 축구반의 코치이름.		필드
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	
	private String scName;
	private String cabinet;
	
	
	public SoccerMember() {
		super();
	}
	
	public SoccerMember(int memberId, String memberName, String phone, String scName, String cabinet){
		super(memberId, memberName, phone);
		this.scName=scName;
		this.cabinet = cabinet;
				
	}
	
	// get set
	public String getScName() {
		return scName;
	}

	public String getCabinet() {
		return cabinet;
	}

	public void setScName(String scName) {
		this.scName = scName;
	}

	public void setCabinet(String cabinet) {
		this.cabinet = cabinet;
	}

	@Override
	public String toString() {
		return "SoccerMember [아이디=" + getMemberId() + " 이름=" + getMemberName() + " 전화번호=" + getPhone() + " 축구반강사이름" + scName + "락커룸=" + cabinet + "]";
		
		
		
	}
	 
	 
	 
	 
	 
	 
}