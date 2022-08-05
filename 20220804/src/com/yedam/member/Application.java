package com.yedam.member;
import java.util.List;
import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner(System.in);
	
	public Application() {
		run();
	}
		
		
	private void run() {
		boolean flag = true;
		while(flag) {
			

		System.out.println("1.전체조회 2.단건조회 3.회원입력 4.회원수정 5.회원삭제 6.종료");
		System.out.print("입력> ");
		
		int menuNo = Integer.parseInt(sc.nextLine());
		
		switch(menuNo) {
		case 1:
			List<Member> list = MemberMangement.getInstance().getMemberList();			//MemberMangement mm = new MemberMangement();
			if(list.size() == 0) {
				System.out.println("데이터가 한 건도 없습니다.");
			}else {
				for(Member member : list) { 
					System.out.println(member.toString());
				}
			}
			break;
			
		case 2:
			System.out.println("조회할 ID 입력> ");
			String id = sc.nextLine();
			Member member = MemberMangement.getInstance().getMember(id);
		
			if(member == null ) {
				System.out.println("등록되지 않은 ID 입니다. ");
			}else {
				System.out.println(member.toString());
			}
			break;
	
		case 3:
			//입력
			Member member2 = new Member();
			
			System.out.println("=======회원등록========");
		
			System.out.print("ID>");
			String str1 = sc.nextLine();
			member2.setId(str1);
			
			System.out.print("PW>");
			String str2 = sc.nextLine();
			member2.setPw(str2);
			
			System.out.print("이름>");
			String str3 = sc.nextLine();
			member2.setName(str3);
			
			int result = MemberMangement.getInstance().insertMember(member2);
			if(result == 1) {
				System.out.println("정상 입력");
			}else {
				System.out.println("입력 실패");
			}
			break;
			
		case 4:
			Member member3 = new Member();
			System.out.println("=======회원수정=======");
			
			System.out.println("수정 ID> ");
			String str4 = sc.nextLine();
			member3.setId(str4);
			
			System.out.println("수정 PW> ");
			String str5 = sc.nextLine();
			member3.setPw(str5);
			
			int result2 = MemberMangement.getInstance().updateMember(member3);
			// == 1 인 이유는 dml 하면 "1 행 이(가) 수정되었습니다" 
			// 수정 성공하면 저 문구가 뜨기 때문에 1이면 정상적으로 된 거
			if(result2 == 1) {
				System.out.println("정상 수정");
			}else {
				System.out.println("수정 실패");
			}
			break;
			
		case 5:
			System.out.println("=======회원삭제=======");
			
			System.out.println("삭제 ID> ");
			String str6 = sc.nextLine();
			int result3 = MemberMangement.getInstance().deleteMember(str6);
			if(result3 == 1 ) {
				System.out.println("정상 삭제");
			}else {
				System.out.println("삭제 실패");
			}
			
			break;
			
		case 6:
			System.out.println("프로그램 종료");
			flag = false;
		}
	}
}
}		