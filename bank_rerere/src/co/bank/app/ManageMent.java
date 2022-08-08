package co.bank.app;

import java.util.Scanner;

import co.bank.account.AccountService;
import co.bank.loan.LoanService;
import co.bank.member.MemberService;

//9
public class ManageMent {
	
	Scanner sc = new Scanner(System.in);
	
	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService();
	
	int menuNo = 0;
	
	public ManageMent() {
		bankJob();
	}

	private void bankJob() {
		
		while(true) {
			
			menuInfo();		//while문 안에 menuInfo넣어줘야함
			
			
			//1.은행원
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
					System.out.println("1.대출 승인 | 2.대출 정보 변경");
					int menu = Integer.parseInt(sc.nextLine());
					if(menu == 1) {
						//대출 승인
						ls.insertLoan();
						
					}else if (menu == 2) {
						ls.updateLoan();
					}
				}else if (menuNo == 7) {
					System.out.println("종료되었습니다. ");
					break;
				}
				
			//0.일반고객		
			}else if(MemberService.memberInfo.getRole().equals("0")) {
				//1.계좌조회 | 2.입, 출금 | 3.계좌이체 | 4.대출
				if(menuNo == 1) {
					as.getAccount();
				}else if(menuNo == 2 ) {
					as.money();
				}else if(menuNo == 3 ) {
					as.transfer();
				}else if(menuNo == 4 ) {
					System.out.println("1.상환 | 2.대출 조회");
					int menu = Integer.parseInt(sc.nextLine());
					//상환
					if(menu == 1) {
						ls.updateMoney();

					//대출	
					}else if (menu == 2) {
						ls.loanInfo();
					}
				}else if(menuNo == 5) {
					System.out.println("종료되었습니다. ");
					break;
				}
				
			}
		}
	} //bankJob 끝

	
	private void menuInfo() {
		if(MemberService.memberInfo.getRole().equals("1")){
			System.out.println("1.고객 등록 | 2.계좌 개설 | 3.입,출금 | 4.계좌 이체 | 5.계좌 해지 | 6.대출 | 7.종료 ");
			
		}else if(MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1.계좌조회 | 2.입, 출금 | 3.계좌이체 | 4.대출 |5.종료");
			
		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(sc.nextLine());
		
	}











}
