package Homework_5;

import java.util.Scanner;

public class Num_2 {

	public static void main(String[] args) {
		//1.class Product ->배열 -> 배열에 있는 데이터를 비교,연산 -> 프로그램
		//2.Product -> 필드 price, amount, name
		//3.product[] proArr;
		//4.각 인덱스 호출 최고 가격, 모든 제품 합 - 최고가격
		//5.코딩
		
		
		//클래스 타입 배열
		Product[] pro = null;
		
		//array list사용가능
		//List<Product> list = new ArrayList<>;
		//List<Product> list = new ArrayList<Product>;
		
		// 삼품 수 = 배열의 사이즈이자 product 객체 숫자
		System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		System.out.print("선택> ");
		
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		boolean flag = true;
		while(flag) {
			switch (num) {
				case 1:
					System.out.print("상품 수를 입력하시오.");
					int count = Integer.parseInt(scanner.nextLine());
					pro = new Product[count];
					break;
					
				case 2:
					for(int i = 0; i < pro.length; i++) {
						//pro[i]번째의 객체를 가지고 옴 Product pro = new Prdouct();
						//기본 생성자만 있을떄
						pro[i] = new Product();
						
						System.out.print("상품 이름 입력하시오.");
						String name = scanner.nextLine();
						pro[i].setName(name);
						
						System.out.print("상품 가격 입력하시오.");
						int price = Integer.parseInt(scanner.nextLine());
						pro[i].setPrice(price);
						
						System.out.print("상품 수량 입력하시오.");
						int amount = Integer.parseInt(scanner.nextLine());
						pro[i].setAmount(amount);
						
					}
					break;
					
				case 3:
					// 향상된 for(배열 타입으로 만들어진 변수 : 배열)
					// product 객체
					for(Product product : pro) {
						System.out.println("상품명: " + product.getPrice() + "상품가격: " + product.getPrice());
					}
					break;
					
				case 4:
					
					int maxPro = 0;			// 최고 가격을 비교하기 위한 변수
					//int idx = 0;			// 최고 가격을 가진 배열 인덱스	
					int sum = 0;			// 총 합계를 구하기 위한 변수
					
					for(int i =0; i<pro.length; i++) {
						// 최고 가격 및 인덱스를 구하기 위함
						if(pro[i].getPrice() > maxPro) {
							maxPro = pro[i].getPrice();
							//idx = i;
						}
						sum += pro[i].getPrice();
					}
					sum -= maxPro;
					//sum -= pro[idx].getPrice();
					System.out.println("최고가격을 뺀 상품 가격의 합: " + sum);
					break;
					
				case 5:
					System.out.println("프로그램 종료");
					flag = false;
					break;
				}
		}
		
		


	
	}
}
