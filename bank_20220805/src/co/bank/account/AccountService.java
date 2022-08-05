package co.bank.account;

import java.util.Scanner;

//14
public class AccountService {

	//1.계좌개설 2.입출금 3.계좌해지 4.계좌이체
	Scanner sc = new Scanner(System.in);
	
	//1.계좌개설
	public void makeAccount() {
		
		Account ac = new Account();
		
		System.out.println("계좌번호> ");
		String accountId = sc.nextLine();
		
		System.out.println("고객 ID> ");
		String customId = sc.nextLine();
		
		ac.setAccountId(accountId);
		ac.setAccountId(customId);
		
	}//계좌개설 makeAccount끝

	//2.입출금
	public void money() {
		
		Account account = new Account();
		
		System.out.println("1.입금 | 2.출금 ");
		int cmd = Integer.parseInt(sc.nextLine());
		
		System.out.println("계좌번호");
		String accountId = sc.nextLine();
		if(cmd == 1) {
			System.out.println("입금금액");
			
		}else if(cmd == 2) {
			System.out.println("출금금액");
		}
		
		int meney = Integer.parseInt(sc.nextLine());
		
		account.setAccountId(accountId);
		account.setBalance(meney);
		
		int result = AccountManage.getInstance().updateMoney(account, cmd);
		
		if(result == 1 && cmd == 1) {
			System.out.println("입금완료");
		}else if(result == 1 && cmd == 2) {
			System.out.println("출금완료");
		}
		
	}//입출금 money 끝
	
	
	//3.계좌해지
	public void deleteAccount() {
		System.out.println("=======계좌 해지=======");
		System.out.println("계좌 입력> ");
		String accountId = sc.nextLine();
		
		int result = AccountManage.getInstance().delAccount(accountId);
		
		if(result == 1) {
			System.out.println("정상 해지");
		}else {
			System.out.println("해지되지 않음");
		}
		
	}
	
	
	//4.계좌이체
		public void transfer() {
			System.out.println("======계좌 이체======");
			
			System.out.println("받는 사람 계좌");
			String toAccountId = sc.nextLine();
			
			System.out.println("보내는 사람 계좌");
			String fromAccountId = sc.nextLine();
			
			System.out.println("출금 계좌");
			int balance = Integer.parseInt(sc.nextLine());
			
			
			AccountManage.getInstance().transferMoney(toAccountId, fromAccountId, balance);
			// 계좌이체
			// 받는 사람 계좌
			// 보내는 사람 계좌
			// 보내는 사람의 비밀번호 (join) 또는 select 계좌와 비밀번호가 맞는지
			// 데이터 유효성 검사
			
			
			
			
			
			
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
