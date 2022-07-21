package Homework_3;

import java.util.Scanner;

// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
// HiNT : 이중 IF문 사용
public class Num_2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("연도를 입력하세요>> ");
		int year = Integer.parseInt(scn.nextLine());
		
		if(year%4 == 0 && year%100 != 0) {
			if(year%400 != 0) {
				System.out.println(year+"년도는 윤년입니다");
			}
		}else{
			System.out.println(year+"년도는 윤년이 아닙니다");
		}
	
		
			
		
		
	}
}
