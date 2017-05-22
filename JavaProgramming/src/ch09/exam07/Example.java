package ch09.exam07;

public class Example {
	public static void main(String[] args) {
		
		/*
		//로컬 클래스를 정의하고 객체 생성
		//B를 상속해서 B2 만들고 객체 생성 
		
		class B2 extends A.B{
			@Override
			void bMethod() {
				System.out.println("B2-bMethod()");
				//super.bMethod();
			}
		}
		//B2 b2 = new B2();	
		//b2.bMethod();  //재정의 된 자식 클래스 호출
		
		A.B b = new B2();
		b.bMethod();
		*/
		
		//익명 객체 
		A.B b = new A.B(){
			@Override
			void bMethod() {
			System.out.println("B2-bMethod()");
			}
		};
		b.bMethod();
	}
}
