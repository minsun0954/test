

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class lotto_T_APP {

	Scanner sc = new Scanner(System.in);

	List<int[]> list = new ArrayList<>();
	int menu = 0;
	
	public lotto_T_APP() { 
		run();
	}

	// private 캡슐 은닉화, 여기서만 사용가능하게 
	// run메소드
	private void run() {

		while (menu != 99) {
			menuInfo();
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				//로또생성
				makeLotto();
				break;
			case 2:
				//로또조회
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

	private void menuInfo() {
		System.out.println("메뉴를 선택해주세요.\n");
		System.out.println("1. 로또생성 2. 로또조회 99. 프로그램 종료");
	}

	private void makeLotto() {
		
		System.out.println("금액을 투입해주세요.");
		
		int money;
		
		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			list.add(makeNumber());
		}
		
		System.out.println("번호 출력 완료\n");
	}

	private void showInfo() {
		
		System.out.println("구매 한 금액> " + (list.size() * 1000) + "원");
		
		for (int i = 0; i < list.size(); i++) {
			// 1번, 2번
			System.out.print((i % 5 + 1) + "번>");
			// 로또 번호 출력
			for (int j = 0; j < 6; j++) {
				System.out.print(list.get(i)[j] + " ");
			}
			
			System.out.println();
			//&&, &
			               // i=0, i % 5 == 0
			if ((i+1) % 5 == 0) {
				System.out.println("-------------------------------------");
			}
		}
	}

	private int[] makeNumber() {
		
		int[] lottoNo = new int[6];
		
		// 번호 6개
		for (int i = 0; i < 6; i++) {
			
			lottoNo[i] = (int)(Math.random()*45)+1;
			
			//첫번째 값은 중복체크 할 필요 없음.
			if (i > 0) {
			                  // j =0, i번째까지, i = 3(index = 0,1,2,3)
				// i = 0 / i=1 j=0 / i=2 j=0 1/ i=3 j=0 1 2 / -> 같은게 발생하면 / i=2 j=0 1 ( 덮어쓰기 )
				for (int j = 0; j < i; j++) {
					//i=2
					if (lottoNo[j] == lottoNo[i]) {
						i -= 1;
						System.out.println("중복제거!");
						break;
					}
				}
			}		
		}
		
		return lottoNo;
	}
}
