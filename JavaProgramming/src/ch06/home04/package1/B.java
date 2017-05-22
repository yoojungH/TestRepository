package ch06.home04.package1;
//패키지가 같은 경우 private빼고 접근 가능
public class B {
	public B(){
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; //private라 접근 못함
		
		a.method1();
		a.method2();
		//a.method3();
	}
}
