package ch09.exam01;

public class A {
	//Field
	
	/* 로컬클래스 */
	//Constructor
	A(){
		class D{}
		
	}
	//메소드가 너무 길 때 메소드 안에서 사용하기 위함
	//생성자가 끝날 때 까지만 살아있음
	
	//Method
	void method(){
		class E{}
	}
	//메소드가 끝날 때 까지만 살아있음
	
	
	/* 중첩 멤버 클래스 */
	//Nested Class
	class B {} //static 안붙어 있으면 A객체가 만들어져야 사용할 수 있다. 따라서 A없이는 사용할 수 없다.
	static class C{} //객체 안에 안들어가고 클래스안에 존재. 클래스 이름만으로 접근할 수 있다. 
	//버튼에 대한 이벤트 처리 객체 --클래스나 인터페이스
	
}
