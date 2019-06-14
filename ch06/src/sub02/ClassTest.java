package sub02;
/*
 * 날짜 : 2019/06/07
 * 이름 : 최창현
 * 내용 : 클래스 실습하기 교재 p191
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Account kb = new Account("국민은행", "123-12-1234", "김유신", 10000);
		
		kb.deposit(10000);
		kb.withdraw(7000);
		
		//private money 외부참조 안됨.
		//kb.money -= 1;
		
		kb.info();
		
		Account sh = new Account("신한은행", "121-11-2312", "김춘추", 50000);

		sh.deposit(5000);
		sh.withdraw(9000);
		sh.info();
		
		// samsung 컴퓨터 객체 생성 Intel i7, 16GB , 1TB
		// apple 컴퓨터 객체 생성 Intel i5, 8GB , 512GB
		
		Computer samsung = new Computer("Intel i7","16GB","1TB");
		samsung.calc();
		samsung.internet();
		samsung.info();
		
		Computer apple = new Computer("Intel i5", "8GB", "512GB");
		apple.internet();
		apple.calc();
		apple.info();
		
	}

}
