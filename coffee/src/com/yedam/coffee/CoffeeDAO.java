package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO {

	//싱글톤
	private static CoffeeDAO coffeeDao = null;
	
	private CoffeeDAO() {
		
	}
	
	public static CoffeeDAO getInstance() {
		return coffeeDao == null ? coffeeDao = new CoffeeDAO() : coffeeDao;
	
	}
	
	//상품 조회
	public List<Coffee> getCoffee(){
		List<Coffee>list = new ArrayList<>();
		Coffee coffee = null;
		
		try {
			conn();
			String sql = "select coffee_menu, coffee_price from coffee";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				coffee = new Coffee();
				
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				
				list.add(coffee);
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			disconnect();
		}return list;
	
	}//상품 조회 getCoffee 끝

	
	
	//상품 상세 조회
	public List<Coffee> getDetailCoffee(){
		List<Coffee>list = new ArrayList<>();
		Coffee coffee = null;

		try {
			conn();
			String sql = "select coffee_menu, coffee_price, coffee_explain from coffee";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				coffee = new Coffee();
				
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));

				list.add(coffee);
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			disconnect();
		}return list;
		
	}//상품 상세 조회 getDetailCoffee 끝
	
	
	//메뉴 등록
	public int insertCoffee (Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "insert into coffee values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());

			result = pstmt.executeUpdate();
				
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;

	}//메뉴 등록 insertCoffee 끝
	
	
	//메뉴 삭제
	public int deleteCoffee(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "delet from coffee where coffee_menu = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, coffeeMenu);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;

	}//메뉴 삭제 deleteCoffee 끝
	
	
	
	//판매(1잔씩만 판매하도록)
	public int salesCoffee(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "update coffee set coffee_sales = +? where coffee_menu = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, coffee.getCoffeeSales());
			pstmt.setString(2, coffee.getCoffeeMenu());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconnect();
		}return result;
	}
	
	
	
	
	//매출(영업 날짜와 상관없이 총 매출)
	
	
	
	
	
	
	
	
	
	
}
