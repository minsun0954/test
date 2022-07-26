package Homework_4;

import java.util.Scanner;

public class Num_1 {
	public static void main(String[] args) {

		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		System.out.println("문제 1번");
		int NUM = arr1[5];
		System.out.println(NUM);
		
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		System.out.println("문제 2번");
		for(int i = 0; i < arr1.length; i++) {
			if(i == 3) {
				continue;
			}System.out.print(arr1[i] + " ");
		}
		System.out.println(" ");
		
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		System.out.println("문제 3번");
		arr1[3] = 1000;
		for ( int num1  : arr1) {
			System.out.print(num1 + " ");
		}
		System.out.println(" ");
		
		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		System.out.println("문제 4번");
		int max = arr1[0];
		int min = arr1[0];
		
		for(int i = 1; i < arr1.length;i++) {
			if(max < arr1[i]) {
				max = arr1[i];
			}
			if(min > arr1[i]) {
				min = arr1[i];
			}
		}System.out.println("최대값: " + max + " 최소값: " + min);
				
		
				
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문제 5번");
		System.out.print("숫자입력> ");
		int[] arr2 = new int[10];
		
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] %3 == 0){
				System.out.print(arr2[i] + " ");
			}
		}
	}

}
