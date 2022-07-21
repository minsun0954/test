package Homework_3;

import java.util.Scanner;

//문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
public class Num_5 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int m = Integer.parseInt(scn.nextLine());
		int n = Integer.parseInt(scn.nextLine());
		
		
		for(int i = 1; i <= n; i++) {
			
				
		System.out.println(m + "*"+ i + "=" + (m*i));
		}
		// n=3 
		// i=1 -> m*1 
		// i=2 -> m*2
		// i=3 >=3 m*3
		
		
		
	}

}
