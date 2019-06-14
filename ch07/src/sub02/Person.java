package sub02;

public class Person {

	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void hello() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
