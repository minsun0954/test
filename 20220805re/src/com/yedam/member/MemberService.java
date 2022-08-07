package com.yedam.member;
//4 db에서 가져온걸로 기능 만들기
public class MemberService {

	public MemberDTO doLogin(MemberDTO member) {
		MemberDTO mem = MemberManage.getInstance().login(member);
		
		if(mem == null) {
			System.out.println("로그인 실패");
			return null;
		}else {
			System.out.println("로그인 성공");
			//mem 로그인 정보 입력
			return mem;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
