package sub01;
/*
 * 날짜 : 2019/06/13
 * 이름 : 최창현
 * 내용 : 인터페이스 실습하기 p344
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		//인터페이스 실습 1 - 클래스의 표준 가이드 역활 
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.soundUp();
		
		samsung.powerOn();
		samsung.powerOff();
		samsung.soundUp();
		
		
		
		
		
		
	}
}
