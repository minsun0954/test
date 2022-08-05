package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberMangement extends DAO{
	
	//싱글톤
	
	//자기자신으로 만든 인스턴스
	private static MemberMangement mm = null;
	
	//생성자
	private MemberMangement() {
		
	}
	
	//단 하나의 객체를 사용할 수 있도록 메소드 생성
	public static MemberMangement getInstance() {
		if(mm == null) {
			return new MemberMangement();
		}else 
			return mm;
	}
		
	
	
	//전체 조회
	public List<Member> getMemberList(){
		List<Member> list = new ArrayList<>();
		// 데이터 들어 와 있는지 체크
		Member member = null;
		try {
			//db연결
			conn();
			//쿼리작성
			String sql = "SELECT * FROM member";
			//연결 후 조회할 수 있는 창구 생성
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				//멤버의 객체를 넣어주고 또 새롭게 넣어주기 위해서 초기화 해줌
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
				list.add(member);
			}
			
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			disconnect();
		}
		return list;
	}
	
	
	
	//단건 조회
	public Member getMember(String id) {
		Member member = null;
		try {
			//db 연결
			conn();
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			//매개변수를 통한 데이터 조회
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));

			}
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			disconnect();
		
		}return member;
	}
	
	
	
	//입력
	public int insertMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,member.getId());
			pstmt.setString(2,member.getPw());
			pstmt.setString(3,member.getName());
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			disconnect();
		
		}return result;
	}
		

	//수정
	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,member.getPw());
			pstmt.setString(2,member.getId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			disconnect();
		
		}return result;
	}
	
	//삭제
	public int deleteMember(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			disconnect();
		
		}return result;
	}
	
	

}
