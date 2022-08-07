package co.bank.member;

import java.util.Scanner;
 
//8  //11고객등록
public class MemberService {

	public static Member memberInfo = null;	
	Scanner sc = new Scanner(System.in);
	
	
	//로그인
	public void doLogin() {
		
		Member member = new Member();
		
		System.out.println("ID> ");
		String id = sc.nextLine();
		
		System.out.println("PW> ");
		String pw = sc.nextLine();
		
		
		// 로그인 정보가 member에 들어감 1row 
		// member 
		member = MemberManage.getInstance().loginInfo(id);
		
		//db입력된 비번과 내가 입력한 비변 비교
		if(member.getMemberPw().equals(pw)) {
			memberInfo = member;
			
		}else{
			System.out.println("로그인 실패");
		}
		
	}//로그인 끝	
		
	//로그아웃
	public void logout() {
		if(memberInfo != null) {
			memberInfo = null;	
		}			
		
	}//로그아웃 끝
		
	//고객등록
	public void registerCustomer() {
		Member member = new Member();
		
		System.out.println("고객 ID> ");
		String id = sc.nextLine();
		
		System.out.println("고객 PW> ");
		String pw = sc.nextLine();
		
		System.out.println("고객 이름> ");
		String name = sc.nextLine();

		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");
		
		int result = MemberManage.getInstance().registCustomer(member);
		
		if(result == 1) {
			System.out.println("고객 정보 등록 완료");
		}else{
			System.out.println("고객 정보 등록 샐패 ");
		}
		
		
		
	}// 고객등록 끝
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
