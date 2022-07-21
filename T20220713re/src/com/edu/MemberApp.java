package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemberApp implements MemberService {

	Scanner scn = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();		//  arraylist 컬렉션(배열을 컬렉션) 클래스member거 사용하고 리스트 멤버에 저장하고 매개변수로 멤버스로 설정하겠다
	
		
	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		// 여러반 등록가능하게...?
			
		while(true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.print("선택> ");
			
			
			int selectNo = Integer.parseInt(scn.nextLine()); 
			
			if(selectNo == 1) {
				//등록
				System.out.print("1.도서반 2.축구반 3.수영반");
				int choice = Integer.parseInt(scn.nextLine());
						
				System.out.print("아이디를 입력하세요.");
				int memberId = Integer.parseInt(scn.nextLine());
			
				System.out.print("이름을 입력하세요.");
				String memberName = scn.nextLine();
				
				System.out.print("연락처를 입력하세요.");
				String phone = scn.nextLine();
				
				if(choice == 1) {
					System.out.print("반장이름>>");
					String info1 = scn.nextLine();
					System.out.print("강의실정보>>");
					String info2 = scn.nextLine();
					addMember(new BookMember(memberId,memberName,phone,info1,info2));
				
				}else if(choice == 2) {
					System.out.print("코치이름>>");
					String info1 = scn.nextLine();
					System.out.print("락커룸>>");
					String info2 = scn.nextLine();
					addMember(new SoccerMember(memberId,memberName,phone,info1,info2));
				
				}else if(choice == 3) {
					System.out.print("강사이름>>");
					String info1 = scn.nextLine();
					System.out.print("수영등급>>");
					String info2 = scn.nextLine();
					addMember(new SwimMember(memberId,memberName,phone,info1,info2));
				}
				
				//members.add(new Member(memberId, memberName, phone));
				
			}else if(selectNo == 2){
				//수정 아이디 입력해서 연락처 수정
				System.out.print("아이디을 입력하세요.");
				int memberId= Integer.parseInt(scn.nextLine());
				
				
				System.out.println("새로운 연락처를 입력하세요. ");
				String phone = scn.nextLine();
				

				modifyMember(new Member(memberId,null, phone));
				// 이렇게 해도 됨
				//Member member = new Member(memberId,null,phone);
				//modifyMember(member);
				
				
				
			}else if (selectNo == 3){
				//전체리스트
				for(int i =0; i< members.size();i++) {
					System.out.println(members.get(i).toString());
				}
				
				
				
				
			}else if (selectNo == 9){
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}else {
				System.out.println("다시 선택해주세요.");
				
			}
			
			
		}
		System.out.println("프로그램 종료");
			
			
			
			
			
		}
		
		
		
		
		
	

	@Override //회원추가
	public void addMember(Member member) {
		members.add(member);
	}

	@Override // 회원정보수정
	public void modifyMember(Member member) {
		for(int i = 0; i < members.size(); i++) {
			if(member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
			}
		}
		//System.out.println(toString());
	}

	@Override // 회원리스트
	public List<Member> memberList() {
		
		return members;
	}
	
	
	// 오버라이드
	//public void List<Member> memberList(){
	// 	return members; 	
	//}
	
}
