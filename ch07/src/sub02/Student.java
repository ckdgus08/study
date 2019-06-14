package sub02;

public class Student extends Person {
	
	protected String school;
	protected String major;
	
	
	public Student(String name,int age, String school, String major ) {
		super(name, age);
		this.school = school;
		this.major = major;
	}
	
	public void hello() {
		super.hello();
		System.out.println("학교 : "+school);
		System.out.println("전공 : "+major);
	}

}
