package com.yedam.member;
//3 db에서 데이터 가져오는 문
import com.yedam.common.DAO;

// member 관련 sql(database)를 다 작성
public class MemberManage extends DAO{
	//싱글톤 어디서든지 부를수 있도록 = null을 해줘야 null이 들어가있는 것 (mm = null;) != ( mm;)
	private static MemberManage mm = null;
	
	//생성자 생성 막기
	private MemberManage() {
		
	}

	public static MemberManage getInstance() {
		
		// 겍체를 초기화 해주는거 
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
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,member.getMemberId());
			pstmt.setString(2,member.getMemberPw());
			//쿼리 실행
			rs = pstmt.executeQuery();
			
			//db에서 데이터 불러올때 rs.next() (메소드임)
			if(rs.next()) {
				mem = new MemberDTO();
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
