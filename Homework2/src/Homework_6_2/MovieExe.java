package Homework_6_2;
//4) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//- 출력결과
//	영화제목 : 추격자
//	감독 : 7
//	배우 : 5
//	영화총점 : 12
//	영화평점 : ☆☆☆☆
//	=====================
//	공연제목:지킬앤하이드
//	감독:9
//	배우:10
//	공연총점 : 46
//	공연평점 : ☆☆☆☆☆
//- 조건
//	관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다.
public class MovieExe {

	public static void main(String[] args) {
		
		Culture m = new Movie("추격자",7,5);
		
		m.setTotalScore(4);
		m.setTotalScore(5);
		m.setTotalScore(3);
		m.setTotalScore(2);
		m.setTotalScore(4);

		m.getInformation();
		
		System.out.println("=====================");
		
		Culture p = new Performance("지킬앤하이드",9,10);
		
		p.setTotalScore(5);
		p.setTotalScore(4);
		p.setTotalScore(3);
		p.setTotalScore(4);
		p.setTotalScore(1);
		
		p.getInformation();
		
		
//		Movie m = new Movie("추격자",7,5);
//		m.setTotalScore();
//		m.getInformation();
//		
//		System.out.println("=====================");
//		
//		Performance p = new Performance("지킬앤하이드",9,10);
//		p.setTotalScore();
//		p.getInformation();
		
		
	}

}
