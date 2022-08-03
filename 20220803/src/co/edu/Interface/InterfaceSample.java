package co.edu.Interface;
// interface 공통 개발 코드를 작성하기 위해서 사용
// 스스로 객체(인스턴스화) 불가, implement를 통해 인터페이스를 상속받아 사용 (다중상속 가능)
// 상수필드와 추상 메소드만 가질수 있음

public interface InterfaceSample {
	//상수필드 
	public static final double PI = 3.14;
	
	
	public void test();
	public int service();

}
