package ch09.home01;
//��ø Ŭ���� ����
class A {
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	class B{
		//static Ŭ������ �ƴϱ⶧���� ��ü�� �־�� ��� ����
		B(){
			System.out.println("B ��ü�� ������");
		}
		int field1;
		//static int field2;
		void method1(){	}
		//static void method2(){}
	}
	
	static class C{
		//��� ����
		C(){
			System.out.println("C ��ü�� ������");
		}
		int field1;
		static int field2;
		void method1(){	}
		static void method2(){}
	}
	
	//���� Ŭ���� --- �����ڳ� �޼ҵ� ���� Ŭ����, ���ο����� ����� �� ����
	void method(){
		class D{
			D(){
				System.out.println("D ��ü�� ������");
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
