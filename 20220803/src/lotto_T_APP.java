
public class lotto_T_APP {

	
	
	private void run() {
		
	}
	
	while ( menu != 99) {
		menuInfo();
	
	
	//첫번째 값은 중복체크 할 필요없음
	if(i > 0) {
		// j=0 i번째까지, i = 3(index = 0,1,2,3)
		for(int j= 0; j<i; j++) {
		// 20 32 14 배열에 들어있는 값	
		// 14 <- randomNum
		// i -= 1 -> 배열을 앞으로 땡기기 위해서
			if(lottoNo[j] == randomNo) {
				i -= 1;
				System.out.println("중복제거");
				break;
			// 중복이 되지 않았을때 추가해주느거
			}else if((j+i) == i) {
				lottoNo[i] = random;
			}
		}
		lotto[i] = randomNp;
		
	}else {
		lotto[i] = randomNo;
	}
	
	}
	

	private void menuInfo() {
		System.out.println();
	}

	
	
	private void showInfo() {
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			// 1번 2번
			System.out.println((i%5 +1) + "번>");
			// 로또 번호 출력
			 for(int j =0; j <6; j++) {
				 System.out.println(list.get(i)[j] + " ");
		
			 }
			 
			 System.out.println(); 
			
			 
			 // (i = 0,  i%5 == 0) 하면 처음부터 찍히기 때문에
			if((i+1) %5 == 0) {
				 System.out.println("------------------");
			 }
		}
	}
	
	private int[] makeNumber() {
		int[] lottoNo = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int randomNum 
		}
	}
	
	
	
	
	
	
	
}
