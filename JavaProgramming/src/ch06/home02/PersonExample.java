package ch06.home02;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//final�� �ƴ� ���� �ٲ� �� ����
		p1.name="��������";
		System.out.println(p1.name);
	}
}
