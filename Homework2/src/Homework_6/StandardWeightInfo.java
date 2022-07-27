package Homework_6;
//2) StandardWeightInfo 클래스를 정의한다.
//- Human 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//(2) public double getStandardWeight() : 표준체중을 구하는 기능
//( * 표준 체중 : (Height - 100) * 0.9 )
public class StandardWeightInfo extends Human{
	//필드
	double height;
	
	//생성자
	StandardWeightInfo(String name, double weight, double height){
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	//메소드
	@Override
	public void getInformation() { 			// : 이름, 키, 몸무게와 표준체중을 출력하는 기능
		System.out.println("이름:" + getName() + "키:" + height + "몸무게:" + getWeight());
	}
	
	
	public double getStandardWeight(double height) {		// : 표준체중을 구하는 기능
		double result = ((height - 100)*0.9);
		return result;
	}
	
	}
