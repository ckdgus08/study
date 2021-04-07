package P2020_03_27;

public class Dice16100415 {

	public static void main(String[] args) {
		boolean temp = true;
		while (temp) {
			// temp 값을 변수로 true가 나오면 게임 재 실행, false가 나오면 종료.

			int user = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("1~6사이 주사위 값을 입력하세요."));
			// user 값 대화상자로 입력받기
			while (!(user >= 1 && user <= 6)) {
				user = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("1~6사이 주사위 값을 다시 입력하세요."));
				// 입력 받은 값이 1~6 범위가 아닐경우 재 입력받기
			}
			
			int random = 7;
			while (random == 7) {
				random = (int) (Math.random() * 6 + 1);
				// 난수 생성 - 1~6 사이를 생성해야 하지만 6이 생성될 확률이 매우 낮으므로 1~6까지의 확률을 비슷하게 해주기 위해
				// 1~7까지 생성후 7이 나올경우 다시 난수를 생성해준다.
			}

			temp = compare(random, user);
			// 컴퓨터, 사용자의 값을 비교하는 함수 + 반복여부를 물어 true or false를 반환
		}

	}

	public static boolean compare(int random, int user) {

		if (random > user) {
			// 컴퓨터 값이 더 클 경우
			System.out.println("컴퓨터 : " +random + " 사용자 : "+user+" => " +"컴퓨터 승리!");
		} else if (user > random) {
			// 사용자 값이 더 클 경우
			System.out.println("컴퓨터 : " +random + " 사용자 : "+user+" => " +"사용자 승리!");
		} else {
			System.out.println("컴퓨터 : " +random + " 사용자 : "+user+" => " +"무승부!");
			// 컴퓨터, 사용자 값이 같을 경우
		}

		String repeat = javax.swing.JOptionPane.showInputDialog("게임을 다시 하려면 yes를 입력해주세요.");
		// 재 실행 여부 묻기
		if (repeat.equalsIgnoreCase("yes")) {
			// 사용자가 Yes,yes,YES으로 입력을 할 가능성도 있기에 대소문자를 가리지 않는 IgnoreCase로 문자열을 비교해준다.
			// (문자열 비교시 == 연산자를 사용하면 원하는 결과를 얻을 수 없다.)
			return true;
			// 재 실행
		} else {
			// yes를 입력하지 않았을 경우
			return false;
			// 재 실행하지 않음
		}

	}
}
