package sub01;

/*
 * 날짜 : 2019/06/11
 * 이름 : 최창현
 * 내용 : 클래스 상속 실습하기 p288
 */
public class InheritanceTest {
	
	public static void main(String[] args) {
		
		SmartPhone gallaxy = new SmartPhone("A10", "8GB", "128GB", "갤럭시10", "010-1234-", 6.5, 100000) ;
		SmartPhone iphone = new SmartPhone("2.3GHZ", "4GB", "512GB", "아이폰7", "010-5678-", 5.5, 130000) ;

		gallaxy.internet();
		gallaxy.call();
		gallaxy.calc();
		gallaxy.info();
		
		iphone.internet();
		iphone.call();
		iphone.calc();
		iphone.info();
		
		
		
		
		
	}

}
