package ch06.home04.package1;
//��Ű���� ���� ��� private���� ���� ����
public class B {
	public B(){
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; //private�� ���� ����
		
		a.method1();
		a.method2();
		//a.method3();
	}
}
