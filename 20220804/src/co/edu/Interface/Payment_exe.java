package co.edu.Interface;

public class Payment_exe {
	public static void main(String[] args) {
		
		Payment cpay = new CardPayment(0.03);
		
		int conline = cpay.online(10000);
		int coffline = cpay.offline(10000);
		
		cpay.showInfo();
		System.out.println("온라인 결제 금액 : " + conline);
		System.out.println("온라인 결제 금액 : " + coffline);
		
		System.out.println(" ");
		
		Payment spay = new simplePayment(0.05);
		
		int sonline = spay.online(10000);
		int soffline = spay.offline(10000);
		
		spay.showInfo();
		System.out.println("온라인 결제 금액 : " + sonline);
		System.out.println("온라인 결제 금액 : " + soffline);
		
		
		
		
		
		
		
		
		
		
		
	}
}
