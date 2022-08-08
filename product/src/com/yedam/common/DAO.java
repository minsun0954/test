package com.yedam.common;

import java.io.FileReader;
//1
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {

	//DAO(Data Access Object) : 

	//java <-> DB 연결할때 쓰는 객체
	protected Connection conn= null;
	//Select(조회) 결과 값 반환 받는 객체
	protected ResultSet rs = null;
	//쿼리문을 담고 쿼리문을 실행하는 객체 (dml)
	protected PreparedStatement pstmt= null;
	//쿼리문을 담고 쿼리문을 실행하는 객체 (select문)
	protected Statement stmt = null;
	
	Properties pro = new Properties();
	
	String driver =  " ";
	String url = " "; 
    String id = " ";
    String pw = " ";

     public void conn() {
    	 try {
    		 //드라이버 로딩
			Class.forName(driver);
			//DB연결
			conn = DriverManager.getConnection(url,id,pw);
    	 } catch (Exception e) {
			e.printStackTrace();
		}
     }
     
     // 연결끊기(거꾸로)
	public void disconnect() {
		try {
			if(rs != null) {
				rs.close();
			
			}if(stmt != null) {
				stmt.close();
			
			}if(pstmt != null) {
				pstmt.close();
				
			}if(conn != null) {
				conn.close();
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 외부 파일을 읽어드려서 연결하는 법 file db.properties
	private void getProperties() {
		try {
			FileReader resource = new FileReader("src/config/db.properties");
			pro.load(resource);
			driver = pro.getProperty("driver");
			url = pro.getProperty("url");
			id = pro.getProperty("id");
			pw = pro.getProperty("pw");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
