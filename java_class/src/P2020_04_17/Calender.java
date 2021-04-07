package P2020_04_17;

public class Calender {

	public static void main(String[] args) {

		int year = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("달력 출력하기 : ___년"));
		// year 입력받기
		int month = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("달력 출력하기 : " + year + "년" + "___월"));
		// month 입력받기
		printCalender(year, month);
		// 달력 출력
	}

	static int getDay(int year, int month) {

		int result = 0;

		for (int i = 1900; year > i; ++i) {
			// 1900년 ~ year-1년 까지 일 수의 합 구하기.
			if (isLeapYear(i)) {
				// 윤년이면
				result += 366;
				// 366일 더하기
			} else {
				// 윤년이 아니면
				result += 365;
				// 365일 더하기
			}
		}

		for (int i = 0; month - 1 > i; ++i) {
			// year년 1월 ~ year년 month-1월 까지 반복
			if (isLeapYear(year)) {
				int[] monthDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				result += monthDay[i];
			} else {
				int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				result += monthDay[i];
			}
		}
		return result;
	}

	static boolean isLeapYear(int year) {
		// 윤년 인지 아닌지 판단
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			// 윤년이면 -> true
			return true;
		} else {
			// 윤년아니면 -> false
			return false;
		}
	}

	static void printCalender(int year, int month) {
		int dow = getDay(year, month) % 7;
		// 요일 판단 - 0일때 월요일 1일때 화요일 ~~~
		int[] lastDay = new int[12];
		// year년도의 1~12월까지의 일수 배열
		if (isLeapYear(year)) {
			// 윤년일때 - 2월 29일까지
			int[] monthDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			lastDay = monthDay;
		} else {
			// 윤년아닐때 - 2월 28일까지
			int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			lastDay = monthDay;
		}

		System.out.println("******** " + year + "년 " + month + "월 " + "********");

		if (dow != 6) {
			// 일요일 부터 시작시 공백 없애기
			for (int i = 0; dow + 1 > i; ++i) {
				// ~1일까지 공백 표시
				System.out.print("    ");
			}
			for (int i = 1; 7 - dow > i; ++i) {
				// 1일부터~ 한줄 표시
				System.out.print(" " + i + "  ");
			}
			System.out.println("");
		}

		for (int j = 0; 6 > j; ++j) {
			// 1달에 최대 6주 까지 있으므로 6번 반복
			for (int i = 7 - dow; 14 - dow > i; ++i) {
				// 한줄이 끝난 시점~ 7일 반복
				if (i + 7 * j < 10) {
					// 자릿수가 한자리이면 -> 한칸 띄운후 출력 (자릿수 맞춰주기 위해)
					System.out.print(" " + (i + 7 * j) + "  ");
				} else {
					// 자릿수가 두자리이면 -> 그대로 출력 (자릿수 맞춰주기 위해)
					System.out.print(i + 7 * j + "  ");
				}
				if (i + 7 * j == lastDay[month - 1])
					// year년 month달의 마지막 날까지 출력했으면
					System.exit(0);
				// 종료
			}
			System.out.println("");
		}

	}

}
