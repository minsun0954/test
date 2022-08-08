package com.yedam.member;
//3 db에서 데이터 가져오는 문
import com.yedam.common.DAO;

// member 관련 sql(database)를 다 작성
public class MemberManage extends DAO{
	//싱글톤 어디서든지 부를수 있도록 = null을 해줘야 null이 들어가있는 것 (mm = null;) != ( mm;)
	private static MemberManage mm = null;
	
	//클래스 생성자를 private으로 생성하여 클래스 외부에서 클래스 생성을 제한함
	private MemberManage() {
		
	}

	public static MemberManage getInstance() { 	// 클래스의 유일한 개체에 대한 참조를 반환
		
		// 겍체를 초기화 해주는거 로그인여부 확인해줌
		if(mm == null) {
			mm = new MemberManage();
		
		}	return mm;
	}
	
	//회원 로그인 메소드
	public MemberDTO login(MemberDTO member) {
		MemberDTO mem = null;
		try {
			//db연결
			conn();
			//sql 로그인 제대로 되었나 확인
			String sql = "select * from member where member_id = ? and member_pw =?";
			//창구 만들기
			pstmt = conn.prepareStatement(sql);				// 쿼리문 수행 pstmt생성
			
			pstmt.setString(1,member.getMemberId());		// SQL  첫번째 ? 값 지정 setString
			pstmt.setString(2,member.getMemberPw());		// SQL  두번째 ? 값 지정 setString
			//쿼리 실행
			rs = pstmt.executeQuery();						// 쿼리문 수행 결과 rs에 저장
			
			//db에서 데이터 불러올때 rs.next() (클래스)
			if(rs.next()) {
				mem = new MemberDTO();						// db에 담긴 값을 가져오기 위한 rs.getString
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberBelong(rs.getString("member_belong"));
				
				
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		//테이터 반환 -> 로그인 되었으면 반환 로그인 안되었으면 null값 반환
		return mem;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
