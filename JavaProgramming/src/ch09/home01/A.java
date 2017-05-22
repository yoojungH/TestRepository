package ch09.home01;
//중첩 클래스 예제
class A {
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	class B{
		//static 클래스가 아니기때문에 객체가 있어야 사용 가능
		B(){
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		//static int field2;
		void method1(){	}
		//static void method2(){}
	}
	
	static class C{
		//모두 가능
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1(){	}
		static void method2(){}
	}
	
	//로컬 클래스 --- 생성자나 메소드 안의 클래스, 내부에서만 사용할 수 있음
	void method(){
		class D{
			D(){
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			//static int field2;
			void method1(){}
			//static void method2(){}
		}
		
		D d =new D();
		d.field1 = 3;
		d.method1();
	}
}
