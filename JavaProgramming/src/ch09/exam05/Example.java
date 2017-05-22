package ch09.exam05;

public class Example {
	public static void main(String[] args) {	
		//A.B b = new A.B(); //A가 없는 상황에서 B를 쓸 수 없음
		A a = new A();
		A.B b = a.new B(); //A가 없는 상황에서 B를 쓸 수 없음
		
		A.C c = new A.C(); //static이라 A없어도 사용할 수 있기 때문에 그냥 붙여줌
		//A에 선언된 C클라스구만 
	}
}
