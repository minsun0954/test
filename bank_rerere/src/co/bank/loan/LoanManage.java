package co.bank.loan;

import java.util.ArrayList;
import java.util.List;

import co.bank.common.DAO;

public class LoanManage extends DAO{
	
	private static LoanManage LoanManage = null;
	
	private LoanManage() {
		
	}

	public static LoanManage getInstance() {
		if(LoanManage == null){
			LoanManage = new LoanManage();
		}
		return LoanManage;
	}
	
	//은행원
	
	//대출승인 insert
	public int insertLoan(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "insert into loan values (?,?,?,?,?)";
			//기본값으로 sysdate가 나오게 하고 싶으면
			//String sql = "insert into loan values (?,?,sysdate,?,?)";
			// 	pstmt.setString(3,loan.getLoanDate()); 이건 지움
			
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,loan.getLoanId());
			pstmt.setString(2,loan.getMemberId());
			pstmt.setString(3,loan.getLoanDate());
			pstmt.setString(4,loan.getState());
			pstmt.setInt(5,loan.getLoanMoney());
			
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;
		
	}
	
	
	
	
	
	//대출정보변경(y,n) update
	public int updateLoan(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set state = ? where loan_id = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,loan.getState());
			pstmt.setString(2,loan.getLoanId());
		
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;
		
	}
	
	
	
	//일반고객
	
	//상황 update
	public int updateMoney(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set loan_money = loan_money-? where loan_id = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,loan.getLoanMoney());
			pstmt.setString(2,loan.getLoanId());
		
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;
		
	}
	//대출조회 select
	//loan table column loan_money
	//고객이름, 대출id, 대출 금액, 대출 날짜
	//join
	public List<Loan> getLoanInfo(String memberId){
		List<Loan> list = new ArrayList<Loan>();
		Loan loan = null;
		
		try {
			conn();
			String sql = "select b.member_name member_name, l.loan_id loan_id, l.loan_money loan_money, l.loan_date loan_date\r\n"
					+ "from bankmember b join loan l \r\n"
					+ "on b.member_id = l.member_id\r\n"
					+ "where b.member_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				loan = new Loan();
				loan.setMemberName(rs.getString("member_name"));			//별칭으로 정해준 컬럼 이름 넣어주기
				loan.setLoanId(rs.getString("loan_id"));
				loan.setLoanMoney(rs.getInt("loan_money"));
				loan.setLoanDate(rs.getString("loan_date"));
				list.add(loan);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return list;
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
