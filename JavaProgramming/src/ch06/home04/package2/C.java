package ch06.home04.package2;
//패키지가 다른 경우  public빼고 접근 불가
import ch06.home04.package1.A;

public class C {
	public C(){
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}
