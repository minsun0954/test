package Homework_5;

import java.util.Scanner;


public class store  {
	//필드
	String goods;
	int price;
	
	//생성자
	public store() {
		
	}

	// get set
	public void getGoods() {
		Scanner scanner = new Scanner(System.in);
		String[] goods = null;
		for(int i = 0; i < goods.length; i++) {
			System.out.print("상품을 입력하시오.");
			goods[i] = scanner.nextLine();
		}
			
		
	}

	public void getPrice() {
		Scanner scanner = new Scanner(System.in);
		int[] price = null;
		for(int i = 0; i < price.length; i++) {
			System.out.print("상품가격을 입력하시오.");
			int goodsNum = Integer.parseInt(scanner.nextLine());
		}
		
	}
		
	

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	

}
