package home_Array;

import java.util.Arrays;

public class Num_2 {

	public static void main(String[] args) {
		// 크기 5의 정수형과 실수형 배열 생성 각각의 마지막 인덱스 값 출력
		int[] array = {1,2,3,4,5};
		double[] array1 = { 1.1,2.2,3.3,4.4,5.5};
	
		System.out.println(array[array.length-1]);
		System.out.println(array1[array1.length-1]);
		
		// 배열의 값들을 for문을 이용하지 않고 한꺼번에 출력하는 코드
		// arrays.toString()메서드
		System.out.println(Arrays.toString(array));
		
		//다중배열
		//방법1
		int[]a,b,c;
		a = new int[3];			// 배열 선언 후 길이 3으로 지정
		a = new int[3];
		a = new int[3];
		
		//방법2
		int d[],e[],f[];
		System.out.println(Arrays.toString(a));
		
		//배열 생성 및 출력
		//String 참조변수 3개 
		String[] str1 = new String[3];
		System.out.println(str1[0]); 		// null
		
		String[] str2 = new String[]{"하이", "바이", "빠잉"};
		System.out.println(str2[0]);
		
		for(String str3 : str2 ) {
			System.out.print(str3+" ");
		}System.out.println();
		
		
		//2차원배열 2*3
		String[][] arr = {
				{"가","나","다"},
				{"A","B","C"}
		};
		//System.out.println(arr[0]);		// 주소값 출력
		System.out.println(arr[0][0]);		// 가
		System.out.println(arr.length);		// 2
		System.out.println(arr[0].length);	// 3
		
		
		//반복문을 사용한 2차원 배열 출력
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[0].length; j++) 
			
			System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		
		 
	
		
		
		
	}

}
