package ch09.exam07;

public class Example {
	public static void main(String[] args) {
		
		/*
		//���� Ŭ������ �����ϰ� ��ü ����
		//B�� ����ؼ� B2 ����� ��ü ���� 
		
		class B2 extends A.B{
			@Override
			void bMethod() {
				System.out.println("B2-bMethod()");
				//super.bMethod();
			}
		}
		//B2 b2 = new B2();	
		//b2.bMethod();  //������ �� �ڽ� Ŭ���� ȣ��
		
		A.B b = new B2();
		b.bMethod();
		*/
		
		//�͸� ��ü 
		A.B b = new A.B(){
			@Override
			void bMethod() {
			System.out.println("B2-bMethod()");
			}
		};
		b.bMethod();
	}
}
