package co.bank.app;

import java.util.Scanner;

import co.bank.member.MemberService;

//6
public class Application {
	
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	
	int menuNo = 0;
	public Application() {
		run();
	}
	
	private void run() {

		System.out.println("1.로그인 | 2.종료");
		menuNo = Integer.parseInt(sc.nextLine());
		switch(menuNo) {
		
		// 로그인하는 기능 -> member테이블에서
		case 1:
			ms.doLogin();
			if(MemberService.memberInfo != null) {
				new ManageMent(); // 로그인 되ㅇㅆ으면 일로 이동하셈
			}
			break;
			
		case 2:
			System.out.println("종료되었습니다. ");
			break;
			
		}
	
	
	
	}
	
}
