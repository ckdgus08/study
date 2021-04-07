package sub02;
/*
 * 날짜 : 2019/06/07
 * 이름 : 최창현
 * 내용 : 클래스 실습하기
 */
public class Account {

	// 특성  - 멤버 변수 
	// 캡슐화  - 맴버변수 접근제어지시자를 private로 지정해서 외부참조를 차단.
	private String bank;
	private String id;
	private String name;
	private int    money;
		
	// 생성자 - 
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// 기능  - 멤버 메서드
	public void deposit(int money) {
		this.money += money;
	}
	

	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("====================");
		System.out.println("은행명  : "+bank);
		System.out.println("계좌번호  : "+id);
		System.out.println("입금주  : "+name);
		System.out.println("현재 잔액  : "+money);
		System.out.println("====================");
	}
	
	
	
	
	
	}

