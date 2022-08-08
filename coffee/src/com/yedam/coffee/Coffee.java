package com.yedam.coffee;

public class Coffee {

//	이름           널?       유형             
//			------------ -------- -------------- 
//			COFFEE_MENU   NOT NULL VARCHAR2(30)   
//			COFFEE_PRICE NOT NULL NUMBER         
//			COFFEE_EXPLAIN          VARCHAR2(1000) 
//			COFFEE_SALES           NUMBER         

	
	private String coffeeMenu;		// 메뉴
	private int coffeePrice;		// 가격
	private String coffeeExplain;	// 메뉴설명
	private int coffeeSales;		// 판매량
	
	
	
	public String getCoffeeMenu() {
		return coffeeMenu;
	}
	public void setCoffeeMenu(String coffeeMenu) {
		this.coffeeMenu = coffeeMenu;
	}
	public int getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	public String getCoffeeExplain() {
		return coffeeExplain;
	}
	public void setCoffeeExplain(String coffeeExplain) {
		this.coffeeExplain = coffeeExplain;
	}
	public int getCoffeeSales() {
		return coffeeSales;
	}
	public void setCoffeeSales(int coffeeSales) {
		this.coffeeSales = coffeeSales;
	}
	
	
	
}
