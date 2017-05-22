package ch06.home04.package1;
//A클래스 내부
public class A {
	//Field
	public int field1;
	int field2;
	private int field3;
	
	//Constructor
	public A(){
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	//Method
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	//Field와 Method 접근제한자 일치시켜줘야하군..
	
}
