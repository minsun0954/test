package co.bank.member;
//2
public class Member {
//	이름          널?       유형           
//			----------- -------- ------------ 
//			MEMBER_ID   NOT NULL VARCHAR2(20) 
//			MEMBER_PW   NOT NULL VARCHAR2(20) 
//			MEMBER_NAME NOT NULL VARCHAR2(20) 
//			ACCOUNT_ID           VARCHAR2(20) 
//			ROLE        NOT NULL CHAR(1)  

	private String memberId;
	private String memberPw;
	private String memberName;
	private String accountId;
	private String role; //권한1.은행원 0.사용자
	
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	
	
	

}
