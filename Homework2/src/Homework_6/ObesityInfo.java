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
	ObesityInfo(String name, double weight, double height) {
		super(name, weight, height);
	}


	@Override
	public void getInformation() {
		System.out.println("이름:" + getName() + "키:" + height + "몸무게:" + getWeight()+ "비만도:" );
		//super.getInformation();
	}

	public double getObesity(double weight, double getStandardWeight) {				//: 비만도를 구하는 기능
		double result = (weight - getStandardWeight)/getStandardWeight*100;
		return result;
	
	}
	

}
