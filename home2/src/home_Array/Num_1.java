package home_Array;

public class Num_1 {
	public static void main(String[] args) {
		//크기 10의 정수형 배열 생성 인덱스로 배열의 공간 값 출력
		
		int[] arrys = new int[10];
		System.out.println(arrys[0]);  //0
		
		
		//배열 요소에 데이터 값을 넣으려면 어떻게 해야하는지 작성해보시오
		arrys[0] = 3;
		System.out.println(arrys[0]);  //3
	
		
		//크기 5인 정수형 배열을 선언하고 55,88,60,100,90으로 각 요소을 초기화하시오
		int[] arrays1 = {55,88,60,100,90};
		System.out.print(arrays1[0]);
		System.out.print(arrays1[1]);
		System.out.print(arrays1[2]);
		System.out.print(arrays1[3]);
		System.out.println(arrays1[4]);
		
		//배열 요소의 값을 반복문을 이용해서 출력
		 for(int i=0;i < arrays1.length; i++) {
			 System.out.print(arrays1[i] + " ");
			 
		 }System.out.println();
	}
}
