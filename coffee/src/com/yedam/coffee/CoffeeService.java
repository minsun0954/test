package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {

	Scanner sc = new Scanner(System.in);
	
	//메뉴 조회
	public void getCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffee();
		
	
		for(Coffee coffee : list) {
			System.out.print("메뉴 : " + coffee.getCoffeeMenu());
			System.out.println("  가격 : " + coffee.getCoffeePrice());
		}
	}//메뉴 조회 getCoffee 끝
	
	
	
	//메뉴 상세 조회
	public void getDetailCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffee();
		
	
		for(Coffee coffee : list) {
			System.out.print("메뉴 : " + coffee.getCoffeeMenu());
			System.out.print(" 가격 : " + coffee.getCoffeePrice());
			System.out.println(" 설명 : " + coffee.getCoffeeExplain());
		}
	}//메뉴 상세 조회 getDetailCoffee 끝
	
	
	
	//메뉴 등록
	public void insertCoffee() {
		Coffee coffee = new Coffee();
		
		System.out.println("메뉴 입력> ");
		String CoffeeName = sc.nextLine();
		
		System.out.println("가격 입력> ");
		int CoffeePrice = Integer.parseInt(sc.nextLine());
		
		System.out.println("설명 입력> ");
		String CoffeeExplain = sc.nextLine();
		
		coffee.setCoffeeMenu(CoffeeName);
		coffee.setCoffeePrice(CoffeePrice);
		coffee.setCoffeeExplain(CoffeeExplain);
		
		int result = CoffeeDAO.getInstance().insertCoffee(coffee);
		
		if(result == 1) {
			System.out.println("메뉴 등록 완료");
		}else {
			System.out.println("메뉴 등록 실패");
		}
	
	}//메뉴 등록 insertCoffee 끝
	
	
	//판매
	public void salesCoffee() {
		System.out.println("메뉴 입력> ");
		String coffeeMenu = sc.nextLine();
		
		int result = CoffeeDAO.getInstance().salesCoffee(coffeeMenu);
		
		if(result == 1) {
			System.out.println("판매량 완료");
		}else {
			System.out.println("판매량 실패");
		}
	}
	
	
	
	
	//메뉴 삭제
	public void deleteCoffee() {
		System.out.println("삭제 메뉴 입력> ");
		String coffeeMenu = sc.nextLine();	
		
		int result = CoffeeDAO.getInstance().deleteCoffee(coffeeMenu);
		
		if(result == 1) {
			System.out.println("메뉴 삭제 성공");
		}else {
			System.out.println("메뉴 삭제 실패");
		}
		
	}//메뉴 삭제 deleteCoffee 끝
		
		
	
	
	
	
	//매출
	public void salCoffee() {
		
		
	}//매출 salCoffee() 끝


	
	
	
	
}
