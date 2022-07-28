package Homework_6;

import java.util.Scanner;

//1) Culture 클래스를 정의한다.
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//(2) public String getGrade() : 평점을 구하는 기능
//(3) public abstract void getInformation() : 정보를 출력하는
public abstract class Culture {
	//필드
	String title;
	int diNum;
	int actNum;
	int num;
	int grade;
	
	//생성자
	Culture(){		
	}
	
	Scanner scanner = new Scanner(System.in);
	int sum;
	
	public void setTotalScore(int score) { 	// : 관객수와 총점을 누적시키는 기능
		
		
		num = scanner.nextInt();
		
		for(int i = 1; i > num; i++) {
			System.out.println("점수를 입력하시오");
				sum = scanner.nextInt(); 
		}
	
	}
	
	public String getGrade() { 								// : 평점을 구하는 기능
		double grade= (double)sum/num;
		
		for(garde >= 4) {
			("")
			
		}
		
		
		
		
		return ;
	
	}
	
	
	public abstract void getInformation() {					// : 정보를 출력하는
		
	}
	
	
	
	}
