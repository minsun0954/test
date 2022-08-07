package co.bank.app;

import java.util.Scanner;

import co.bank.account.AccountService;
import co.bank.member.MemberService;

//9
public class ManageMent {
	
	

	Scanner sc = new Scanner(System.in);
	int menuNo = 0;
	
	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	
	public ManageMent() {
		bankJob();
	}

	private void bankJob() {
		menuInfo();
		while(true) {
			if(MemberService.memberInfo.getRole().equals("1")) {
				if(menuNo == 1) {
					ms.registerCustomer();
					// 1.고객등록 | 2.계좌 개설 | 3.입금출금 | 4.계좌이체 | 5.계좌 해지 | 6.대출
				}else if(menuNo == 2 ) {
					as.makeAccount();
				}else if(menuNo == 3 ) {
					as.money();
				}else if(menuNo == 4 ) {
					as.transfer();
				}else if(menuNo == 5 ) {
					as.deleteAccount();
				}else if(menuNo == 6 ) {
					
				}
					
					
			}else if(MemberService.memberInfo.getRole().equals("0")) {
				
			}
			
			
		}
	}

	
	private void menuInfo() {
		if(MemberService.memberInfo.getRole().equals("1")){
			System.out.println("1.고객등록 | 2.계좌 개설 | 3.입금출금 | 4.계좌이체 | 5.계좌 해지 | 6.대출 ");
			
		}else if(MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1.계좌조회 | 2.입금 | 3.출금 | 4.계좌이체 | 5.대출 ");
			
		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(sc.nextLine());
		
	}











}
