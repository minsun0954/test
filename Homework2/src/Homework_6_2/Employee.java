package Homework_6_2;
//1) Employee 클래스를 정의한다.
//- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 각 필드의 getter만 존재한다.
//- 메소드는 다음과 같이 정의한다.

public class Employee {
	//필드
	private String name;
	private int salary;

	//생성자 같은 이름을 가졌지만 매개변수가 달라서 여러개 생성 가능 => 오버로딩
	public Employee() {
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	public void getInformation() {		// : 이름과 연봉을 출력하는 기능
		 System.out.println("이름: " + name + "연봉: " + salary);
	 }
	 
	public void print() { 				// : "수퍼클래스"란 문구를 출력하는 기능
		 System.out.println("수퍼클래스");
	 }

}
