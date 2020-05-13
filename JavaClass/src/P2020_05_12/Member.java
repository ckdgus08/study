package P2020_05_12;

import java.util.Scanner;

public class Member {

	public static int member_count = 0;
	public String id;
	private String pwd;

	public Member(String id) {
		this.id = id;
		member_count++;
	}
	
	public boolean is_ok_pwd(String pwd) {
		if (pwd.length() >= 4 && pwd.length() <= 10) {
			for (int i = 0; pwd.length() > i; ++i) {
				if (!(((int) pwd.charAt(i)) >= 65 && ((int) pwd.charAt(i)) <= 90)) {
					return false;
				}
			}
			return true;
		}
		return false;

	}
	
	public String gen_pwd() {
		String samplepwd = "";
		int rand1 = (int) (Math.random() * 6 + 4.5);
		for (int i = 0; rand1 > i; ++i) {
			int rand2 = (int) (Math.random() * (25) + 65.5);
			samplepwd += (char) rand2;
		}
		return samplepwd;

	}
	
	public boolean set_pwd(String password) {
		pwd = password;
		String samplePwd = gen_pwd();
		System.out.println("추천 패스워드 : " + samplePwd);
		for (int i = 0; 3 > i; ++i) {
			Scanner sc = new Scanner(System.in);
			System.out.print("패스워드 입력 : ");
			pwd = sc.next();
			if (is_ok_pwd(pwd)) 
				return true;
		}
		return false;
	}
}
