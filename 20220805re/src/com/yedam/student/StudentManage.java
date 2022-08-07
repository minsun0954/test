package com.yedam.student;

import com.yedam.common.DAO;

//Student 관련 sql(database)를 다 작성
public class StudentManage extends DAO{
	//싱글톤 어디서든지 부를수 있도록 
	private static StudentManage SM = new StudentManage();
	
	//클래스 생성자를 private으로 생성하여 클래스 외부에서 클래스 생성을 제한함
	private StudentManage(){
		
	}
	
	public static StudentManage getInstance(){	// 클래스의 유일한 개체에 대한 참조를 반환
		return SM; // 싱글톤 불러 올 수 있게 하는거
		
		
	}
	
	
	
	
	//학생등록
	public int insertStudent(StudentDTO std) {
		int result = 0;
		try {
			//db연결
			conn();
			//sql 로그인 제대로 되었나 확인
			String sql = "insert into student (student_id, student_name, student_class, student_addr, student_tel)\r\n"
					+ "values (?,?,?,?,?)";
			//창구 만들기
			pstmt = conn.prepareStatement(sql);			// 쿼리문 수행 pstmt생성
			
			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentClass());
			pstmt.setString(4, std.getStudentAddr());
			pstmt.setString(5, std.getStudentTel());
			//쿼리 실행
			result = pstmt.executeUpdate(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;
		
		
	}
	
	//학생성적입력 국어
	public int insertKor(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_kor=? where student_id =?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, std.getStudentKor());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;
	}
	
	//학생성적입력 영어
	public int insertEng(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "update student set student_Eng=? where student_id =?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, std.getStudentEng());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;
	}
	
	
	//학생성적입력 수학
		public int insertMath(StudentDTO std) {
			int result = 0;
			try {
				conn();
				String sql = "update student set student_Math=? where student_id =?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, std.getStudentMath());
				pstmt.setInt(2, std.getStudentId());
				
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}return result;
		}
	
	
	//학생정보수정 전화번호
		public int updateTel(StudentDTO std) {
			int result = 0;
			try {
				conn();
				String sql = "update student set student_tel=? where student_id =?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, std.getStudentTel());
				pstmt.setInt(2, std.getStudentId());
				
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}return result;
		}
		
	
	//학생정보조회
	
	public StudentDTO getStudent(int id) {
		StudentDTO std = null;
		try {
			conn();
			
			String sql = "select * from student where student_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				std = new StudentDTO();
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentTel(rs.getString("student_tel"));
				std.setStudentAddr(rs.getString("student_addr"));
				std.setStudentClass(rs.getString("student_class"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return std;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
