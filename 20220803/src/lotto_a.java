import java.util.Scanner;

public class lotto_a {
	
	
	
	while (menu !=99) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("메뉴를 선택해주세요. ");
		System.out.println("1. 로또생성 2. 로또조회 99. 프로그램 종료");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch (menu) {
		case 1:
			//로또생성
			System.out.println("금액을 투입해주세요.");
			
			int money;
			
			money = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < (money / 1000); i++) {
				list.add(makeNumber());
			}

			
			
			
			
		case 2:
			//로또조회


			
			
			
		case 99:
			System.out.println("프로그램 종료");
			break;
		
		
	}
	
}
