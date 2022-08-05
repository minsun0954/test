package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class Management extends DAO{

	public Management() {
		//전체조회
		showInfo();
		//한건조회
		getMember();
		//한건 입력
		//insertInfo();
		//수정
		//updateInfo();
		//삭제
		//deleteInfo();
		
	}
	
	//전체조회 member테이블에 있는 내용
	private void showInfo() {
		List<Member> list = new ArrayList<>();
		Member mem = null;
		
		try {
			//conn()메소드로 db연결
			conn();
			//쿼리문 작성
			String sql = "select * from member";
			//연결된 db에 쿼리문 보낼 수 있는 창구 생성
			stmt = conn.createStatement();
			//위에서 만든 창구로 쿼리문을 보냄
			// ResultSet(rs) select 조회할때만 사용
			rs = stmt.executeQuery(sql);
			
			// rs.next() 데이터가 있는지 없는지 조회하는 메소드 => 있으면true(반복문 실행)/false(반복문 나감)
			// mem.set 값 설정하기(rs.getString("컬럼명")) 
			// list.add(mem); 객체에 리스트 담아주기 
			while(rs.next()) {
				mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setName(rs.getString("name"));
				mem.setPw(rs.getString("pw"));
				list.add(mem);
			}
		}catch(Exception e) {
			e.printStackTrace();
		
			// 연결 성공하든 못하든 실행하는 연결끊어주는거
		}finally {
			disconnect();
		}
		
		for(Member member : list) {
			System.out.println(member.toString());
		}
	}

	
	//한건조회
	private void getMember() {
		Member member = null;
	
		try {
			//db 연결
			conn();
			//쿼리문 작성
			String sql = "select * from member where id = ?";
			// 창구 만들면서 동시에 쿼리문 보냄
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A");					//첫번째 ? 에 A넣어라
			// DML (insert, update, delete) -> executeUpdate()
			// Select -> executeQuery
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
		}
		System.out.println("********************************");
		System.out.println(member.toString());
	}
	
	
	// 한건 입력
	private void insertInfo() {
		int result = 0;
		try {
			//db 연결
			conn();
			//쿼리작성
			String sql = "insert into member values(?,?,?)";
			//창구 생성
			pstmt = conn.prepareStatement(sql);
			//데이터 입력
			pstmt.setString(1, "D");			// 1번 ? 에 입력
			pstmt.setString(2, "1234");
			pstmt.setString(3, "김씨");
			// 넣은거 또 넣으면 primary키 중복때문에 오류남
			
			// DML (insert, update, delete) -> executeUpdate()
			// Select -> executeQuery
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			disconnect();
		}
		// 자동 commit됨 
		System.out.println("********************************");
		if(result == 1) {
			System.out.println("정상 입력되었습니다.");
		}else{
			System.out.println("입력에 실패하였습니다.");
		}
	}//insertInfo 끝
	
	//수정
	private void updateInfo() {
		int result = 0;
		try {
			//db연결
			conn();
			//쿼리 작성
			String sql = "update member set pw=? where id=?";
			//창구 및 쿼리 생성
			pstmt = conn.prepareStatement(sql);
			//터이터 입력
			pstmt.setString(1, "4321");
			pstmt.setString(2, "A");
			//
			result = pstmt.executeUpdate();
		
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			disconnect();
		
		}
		if(result == 1) {
			System.out.println(result + "건이 수정되었습니다.");
		}else {
			System.out.println("수정되지 않았습니다.");
		}
		
	}//updateInfo 끝
	
	//삭제
	private void deleteInfo(){
		int result = 0;
		try {
			
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A");
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			disconnect();
		}
		
		if(result == 1) {
			System.out.println(result + "삭제되었습니다.");
		}else {
			System.out.println("삭제되지 않았습니다.");
		}
	
	}//deleteInfo 끝
	
	
	
}
