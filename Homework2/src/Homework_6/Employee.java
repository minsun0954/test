package Homework_6;
//1) Employee 클래스를 정의한다.
//- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 각 필드의 getter만 존재한다.
//- 메소드는 다음과 같이 정의한다.

public class Employee {
	//필드
	String name;
	int salary;

	//생성자
	Employee() {
		
	}
	
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	

	public void getInformation() {		// : 이름과 연봉을 출력하는 기능
		 System.out.println(name + salary);
		 
	 }
	 
	public void print() { 				// : "수퍼클래스"란 문구를 출력하는 기능
		 System.out.println("수퍼클래스");
	 }

}
