import java.util.Scanner;

public class lotto {
	// QUIZ		

	//로또 생성 및 관리
	//1. 중복되지 않은 번호가 6개 출력된다.
	//2. 한장당 총 1~5줄 생성된다.
	//3. 한 줄당 금액은 천원이며, 입력한 금액만큼 생성한다.
	//4. 구매 금액, 생성된 로또 번호를 출력한다.
	//5. 5장씩 끊어서 출력할 것
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int mon = 0;
		boolean run= true;
		while(run) {
			System.out.println("메뉴를 선택해주세요. ");
			System.out.println("1.로또생성 2.로또조회 99.종료");
			
			int num = Integer.parseInt(scanner.nextLine());
			
		if(num ==1) {
			System.out.println("금액을 투입해주세요. ");
			mon = Integer.parseInt(scanner.nextLine());
			
		}else if (num ==2) {
			System.out.println("구매한 금액> " + mon);
			
			int time = mon/1000;
			System.out.println(time);
			
			int[] lot = new int[6];
			
			for(int i = 1; i <= time; i++) {	
				
				System.out.print(i +"번> ");
			
				
				
				for(int j = 0; j < lot.length; j++) {
					int ranNum = (int)(Math.random()*45)+1;
					lot[j] = ranNum;
					
						if(lot[j] != ranNum) {
						 continue;
					 }
						
						
					System.out.print(lot[j] + " ");
				}System.out.println(" ");  
			
			
			}	
			
			
			
				
		}else if(num == 99) {
			System.out.println("프로그램 종료");
				
			}
		//run = false;
		//System.out.println("종료");	
		} 
			
		
		
		
		
	}
	

}
