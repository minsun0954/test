package Homework_2;
//문제4) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
	//	System.out.println(intResult);
public class Num_4 {
	public static void main(String[] args) {

		
		int val = -4; 
		int intResult = (val>0)? val : 0;
		System.out.println(intResult);
	
		
		// if문 ( 이런 방법이 있다... 삼항연산자가 더 좋음 )
		if(val > 0){
			System.out.println(val);
		}else {
			System.out.println(0);
		}
		
		// 메소드로 하는 방법 ( 이런것도 있따...)
		//public int exam() {
			//return (val>0)? val : 0;
		//}

	}

}
