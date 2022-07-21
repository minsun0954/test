package Homework_3;
//문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// *
		// **
		// ***
		// ****
		// *****
public class Num_4 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 5; i++) {
			for(int j = 1 ; j <= i; j++) {
				System.out.print("*");	
			}System.out.println(" ");
		}

		// i 별 하나
		// j줄의 반복
		
	}
}
