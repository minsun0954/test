package Homework_6_2;

import java.util.Scanner;

//2) EmpDept 클래스를 정의한다.
//- Employee 클래스를 상속한다.
//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 추가된 필드의 getter를 정의한다.
//- Employee 클래스의 메소드를 오버라이딩한다.
//(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
//(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
//
public class EmpDept extends Employee{
	// 필드
	private String department;
	
	//생성자
	EmpDept(String name, int salary, String department){
		super(name,salary);		// 자식 객체를 만들때 부모 생성자도 만들어줘야함
		this.department = department;
	}

	//gets
	public String getDepartment() {
		return department;
	}

	//
	@Override
	public void getInformation() {
		System.out.println("이름:"+ getName() +" 연봉:" + getSalary() +" 부서:"+ department);
		
	}

	@Override
	public void print() {
		super.print();			// 부모가 가진 값을 출력해주고
		System.out.println("서브클래스");
	}

	
		
		
		
	
	
	
	
	
	
	
	
	
}
