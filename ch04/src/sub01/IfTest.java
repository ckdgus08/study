package sub01;
/*
 * 날짜 : 2019/06/04
 * 이름 : 최창현
 * 내용 : if문 연습문제
 */
public class IfTest {
	public static void main(String[] args) {
		
		int score = 90;
		
		if(score >= 90 && score<= 100 ) {
			// 90~100
			System.out.println("A 입니다");
		}else if(score>=80 && score<90 ) {
			// 80~89
			System.out.println("B 입니다");
		}else if(score>=70 && score<80) {
			// 70~79
			System.out.println("C 입니다");
		}else if(score>=60 && score<70) {
			// 60~69
			System.out.println("D 입니다");
		}else {
			// 0~59
			System.out.println("F 입니다");

			
		}
			
		
	}

}
