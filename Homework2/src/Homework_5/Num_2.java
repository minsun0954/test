package Homework_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<store> stores = new ArrayList<store>();
		
		//store stores = new store();
		
		String[] goods = null;
		int[] price = null;
		
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.print("선택> ");
			
			int num =Integer.parseInt(scanner.nextLine());
			
			if( num==1 ) {
				
				System.out.print("상품 수를 입력하시오.");
				int goodsNum = Integer.parseInt(scanner.nextLine());
				goods = new String[goodsNum];
				price = new int[goodsNum];	
			
			}else if(num == 2) {
				
				stores.getGoods();
				stores.getPrice();
							
			}else if(num == 3) {
			
				for(int i = 0; i <goods.length; i++) {
					System.out.println("상품명 : " + goods[i] + " 가격: " + price[i]);
				}
			}else if(num == 4) {
				
				int max = price[0];
				int sum = 0;
				
				for(int i= 0; i < goods.length; i++) {
					if(max < price[i]) {
						max = price[i];
					}
					sum += price[i];
				}
				int items = sum - max;
				System.out.println("최대 가격을 제외한 제품들의 총합: " + items);	
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			
		}System.out.println("프로그램 종료");
		

	}

}
