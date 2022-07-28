package Homework_6;
//3) ObesityInfo 클래스를 정의한다.
//- StandardWeightInfo 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )

public class ObesityInfo extends StandardWeightInfo{
	//필드

	
	//생성자
	ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	
	}



	public void getInformation() {
		System.out.println(getName() + "의 신장 " + height + " 몸무게 " + getWeight()+ getObesity());
	}

	public String getObesity() {				//: 비만도를 구하는 기능
		double bmi = (weight - getStandardWeight())/getStandardWeight()*100;
		
		String result;
		if(bmi>=30) {
			result = "비만입니다.";
		}else if(25<=bmi && bmi<=29) {
			result = "과제중입니다.";
		}else if(20<=20 && bmi <=24) {
			result = "정상입니다.";
		}else{
			result = "저체중입니다.";
		}
	
		return result;
	
	}
	

}
