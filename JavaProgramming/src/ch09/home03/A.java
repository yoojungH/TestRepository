package ch09.home03;
/* 정적 클래스에 인스턴스 필드, 메소드 사용할 수 없음  */
public class A {
	
	//인스턴스 
	int field1;
	void method1(){}
	
	//정적
	static int field2;
	static void method2(){}
	
	class B{
		void method(){
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C{
		void method(){
			//field1 = 10;
			//method1();
			field2 = 3;
			method2();
		}
	}
}
