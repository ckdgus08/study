package P2020_04_03;

import javax.swing.JOptionPane;

public class Subject16100415 {
	public static void main(String[] args) {
		String[] words = { "사과", "apple", "바나나", "banana", "오렌지", "orange", "망고", "mango", "복숭아", "peach", "파인애플",
				"pineapple", "수박", "watermelon", "메론", "melon", "딸기", "strawberry", "배", "pear", "고구마", "sweatpotato" };
// 단어의 갯수 11개
		game(words);
	}

	public static void game(String[] words) {
		int index = (int) (Math.random() * 11);
		while (index == 11) {
			index = (int) (Math.random() * 11);
		}
// 단어의 인덱스 0~10 난수 생성
		String input = javax.swing.JOptionPane.showInputDialog(words[index * 2]);
// 영어 단어를 입력 받음.
		int result = 0;
// result 변수 선언
		if (input.equalsIgnoreCase(words[index * 2 + 1])) {
// 영어 단어의 뜻이 맞을 경우
			result = javax.swing.JOptionPane.showConfirmDialog(null, "축하합니다. ^^, 계속 하시겠습니까?");
// 성공 메시지 출력 + 게임 계속 진행여부 팝업 띄우기
		} else {
// 영어 단어의 뜻이 틀릴 경우
			result = javax.swing.JOptionPane.showConfirmDialog(null, "아쉽네요. ^^, 계속 하시겠습니까?");
// 실패 메시지 출력 + 게임 계속 진행여부 팝업 띄우기
		}
		if (result == JOptionPane.YES_OPTION) {
// yes 클릭시
			game(words);
// 게임 다시 진행
		} else {
// yes 클릭하지 않았을 경우
			javax.swing.JOptionPane.showMessageDialog(null, "게임을 종료 합니다.");
// 게임종료 메시지 띄우기
		}
	}
}