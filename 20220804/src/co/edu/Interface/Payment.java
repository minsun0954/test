package co.edu.Interface;
//(1) Payment 인터페이스
//- 다음과 같이 상수필드를 가진다.
//  1) 온라인 결제 할인율 (ONLINE_PAYMENT_RATIO), 5%
//  2) 오프라인 결제 할인율 (OFFLINE_PAYMENT_RATIO), 3%  
//- 다음과 같이 추상 메서드를 가진다.
//  1) 온라인 결제 메서드 시그니처 :　public int online(int price)
//  2) 오프라인 결제 메서드 시그니처 :　public int offline(int price)
//  3) 결제 정보 출력 메서드 시그니처 : public void showInfo()

public interface Payment {
	//상수필드 상수는 대문자로 작성
	public static final double ONLINE_PAYMENR_RATIO = 0.05;
	public static final double OFFLINE_PAYMENT_RATIO = 0.03;
	
	// 추상메소드 강제로 오버라이딩 해줘야함
	//public abstract int online(int price); -> abstract 안적어줘도 상관없음
	public int online(int price);
	public int offline(int price);
	public void showInfo();
		
	
	
	
	
}
