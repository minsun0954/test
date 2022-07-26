package Homework_5;

import java.util.Scanner;

//문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.

		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
public class Num_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
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
				
				for(int i = 0; i < goods.length; i++) {
					System.out.print("상품을 입력하시오.");
					goods[i] = scanner.nextLine();
					
					System.out.print("상품가격을 입력하시오.");
					price[i] = Integer.parseInt(scanner.nextLine());
				}		
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
