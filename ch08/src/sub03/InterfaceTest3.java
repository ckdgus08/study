package sub03;
/*
 * 날짜 : 2019/06/13
 * 이름 : 최창현
 * 내용 : 인터페이스 실습하기 p344
 */
public class InterfaceTest3 {

	public static void main(String[] args) {
		
		// 인터페이스 실습 3 - 객체간 결합도를 완화 
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}
}
