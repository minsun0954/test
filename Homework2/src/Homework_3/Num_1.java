package Homework_3;

import java.util.Scanner;

// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
// 제1사분면 : x>0, y>0
// 제2사분면 : x<0, y>0
// 제3사분면 : x<0, y<0
// 제4사분면 : x>0, y<0
public class Num_1 {
	public static void main(String[] args) {
		
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("x를 입력하세요>> ");
		int x = Integer.parseInt(scn.nextLine());
		System.out.print("y를 입력하세요>> ");
		int y = Integer.parseInt(scn.nextLine());
		
		if(x>0 && y>0) {
			System.out.println("1사분면");
		}else if(x<0 && y>0) {
			System.out.println("2사분면");
		}else if(x<0 && y<0) {
			System.out.println("3사분면");
		}else if(x>0 && y<0) {
			System.out.println("4사분면");
		}else {
			System.out.println("숫자를 입력해주세요");
		}
		
		
		

	}

}
