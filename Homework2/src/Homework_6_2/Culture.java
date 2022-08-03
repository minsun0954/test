package Homework_6_2;

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
	protected String title;
	protected int diNum;
	protected int actNum;
	protected int num; 
	protected int totalScore; //총점
	
	//생성자
	Culture(String title,int diNum,int actNum ){
		this.title = title;
		this.diNum = diNum;
		this.actNum = actNum;
	}
	
	Scanner scanner = new Scanner(System.in);
	int sum;
	
	public void setTotalScore(int score) { 	// : 관객수와 총점을 누적시키는 기능
		
		num++;							// 평점 인원 추가
		totalScore += score;			// 총점에 평점 추가
		
//		System.out.println("관객수를 입력하시오.");
//		num = Integer.parseInt(scanner.nextLine());
//		
//		for(int i = 1; i <= num; i++) {
//			System.out.println("1~5점 사이이의 평점를 입력하시오");
//			score = Integer.parseInt(scanner.nextLine());
//			sum += score;
//			
//		}
	
	}
	
	public String getGrade() { 								// : 평점을 구하는 기능
		int avg = totalScore/num;
		String grade = null;
		switch (avg) {
		case 1:
			grade = "★☆☆☆☆";
			break;
			
		case 2:
			grade = "★★☆☆☆";
			break;
		case 3:
			grade = "★★★☆☆";
			break;
		case 4:
			grade = "★★★★☆";
			break;
		case 5:
			grade = "★★★★★";
			break;

		}
		return grade;
		
//		double grade= (double)totalScore/num;
//		String result;
//		
//		if(grade >= 5) {
//			result ="☆☆☆☆☆";
//		}else if(grade >= 4 ) {
//			result = "☆☆☆☆";
//		}else if(grade >= 3 ) {
//			result = "☆☆☆";
//		}else if(grade >= 2 ) {
//			result = "☆☆";
//		}else{
//			result = "☆";
//		}
//		
//		return result;
	
	}
	
	
	public abstract void getInformation();				// : 정보를 출력하는
		
	
		
	
	
	
	
	}
