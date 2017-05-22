package ch06.home02;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//final이 아닌 값만 바꿀 수 있음
		p1.name="을지문덕";
		System.out.println(p1.name);
	}
}
