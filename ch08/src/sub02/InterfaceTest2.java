package sub02;
/*
 * 날짜 : 2019/06/13
 * 이름 : 최창현
 * 내용 : 인터페이스 실습하기 p344
 */
public class InterfaceTest2 {
	
	public static void main(String[] args) {
		
		// 인터페이스 실습 2 - 다중 상속의 역활
		SmartTV stv = new SmartTV();
		stv.internet();
		stv.booting();
		stv.powerOff();
		stv.powerOn();
		stv.syncAndroid();
	}

}
