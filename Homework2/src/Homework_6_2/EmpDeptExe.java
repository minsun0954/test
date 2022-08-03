package Homework_6_2;

//3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//- 출력결과
//이름:이지나  연봉:3000  부서:교육부
//수퍼클래스
//서브클래스

public class EmpDeptExe {

	public static void main(String[] args) {
		
		EmpDept empDepts = new EmpDept("이지나", 3000 ,"교육부");
		
		empDepts.getInformation();
		empDepts.print();	
		

	}

}
