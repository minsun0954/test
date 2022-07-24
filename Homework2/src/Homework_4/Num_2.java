package Homework_4;
// 문제) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
//		 실행결과를 보고, 알맞게 작성해보세요.

import java.util.Scanner;

public class Num_2 {
	public static void main(String[] args) {
	
	
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			
			
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> " );
					scores[i] = scanner.nextInt();
				}
				
				break;
			case 3:
				for ( int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				
				break;
			case 4:
				int max = scores[0];
				double avg; int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					sum = sum + scores[i];	
				}
				avg = (double)sum/scores.length;
				
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : %.1f\n" , avg);
				
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			
			
			}
	}
	
	
	
	
	
	}
}
