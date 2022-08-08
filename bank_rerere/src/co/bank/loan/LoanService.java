package co.bank.loan;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import co.bank.member.MemberService;

public class LoanService {

	Scanner sc = new Scanner(System.in);
	
	
	//대출 승인 
	public void insertLoan() {
		//입력한거 담아주는 거 (인스턴스)
		Loan loan = new Loan();
		
		System.out.println("대출 ID> ");
		String loanId = sc.nextLine();
		
		System.out.println("회원 ID> ");
		String memberId = sc.nextLine();
		
		System.out.println("대출 금액> ");
		int loanMoney = Integer.parseInt(sc.nextLine());
		
		System.out.println("대출 날짜> ");
		
		String startDay = sc.nextLine();
		
//		Date date = null;
//		//String -> ( ) -> Date
//		//String -> DateFormat -> Date
//		//DateFormat -> SimpleDateFormat(날짜형태)
//		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//		
//		//날짜 포맷으로 받을때만 되도록 예오ㅣ처러 해줌
//		try {
//			date = (Date) dateFormat.parse(startDay);
//		}catch(ParseException e){
//			e.printStackTrace();
//		}
		
		System.out.println("대출 상태> ");
		String state = sc.nextLine();
		
		loan.setLoanId(loanId);
		loan.setMemberId(memberId);
		loan.setLoanMoney(loanMoney);
		loan.setLoanDate(startDay); 
		loan.setState(state);
		
		int result = LoanManage.getInstance().insertLoan(loan);
		
		if(result == 1) {
			System.out.println("대출 완료");
		}else {
			System.out.println("대출 실패");
		}
		
	}//대출 승인 insertLoan 끝
	
	
	
	
	//대출 정보 변경
	public void updateLoan() {
		
		Loan loan = new Loan();
		
		System.out.println("대출 ID> ");
		String loanId = sc.nextLine();
		
		System.out.println("상태 변경> ");
		String state = sc.nextLine();
		
		loan.setLoanId(loanId);
		loan.setState(state);
		
		int result = LoanManage.getInstance().updateLoan(loan);
		
		if(result == 1) {
			System.out.println("상태 변경 완료");
		}else {
			System.out.println("상태 변경 실패");
		}
		
	}//대출 정보 변경 updateLoan 끝
	
	
	
	//상환
	public void updateMoney() {
		
		Loan loan = new Loan();
		
		System.out.println("대출 ID> ");
		String loanId = sc.nextLine();
		
		System.out.println("상환 금액> ");
		int loanMoney = Integer.parseInt(sc.nextLine());
		
		loan.setLoanId(loanId);
		loan.setLoanMoney(loanMoney);
		
		int result = LoanManage.getInstance().updateMoney(loan);
		
		if(result == 1) {
			System.out.println("상환 완료");
		}else {
			System.out.println("상환 실패");
		}
		
	}//상환 updateMoney 끝
	
	
	
	
	//대충 정보 조회 
	public void loanInfo() {
		
		
		List<Loan> list = LoanManage.getInstance().getLoanInfo(MemberService.memberInfo.getMemberId());
		
		System.out.println(MemberService.memberInfo.getMemberName() + " 님의 대출 정보");
		
		for(Loan loan : list) {
			//회원 이름, 대출 Id, 대출금액, 대출 날짜
			
			System.out.println("대출ID : " + loan.getMemberId());
			System.out.println("대출금액: " + loan.getLoanMoney());
			System.out.println("대출날짜 : " + loan.getLoanDate());
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
