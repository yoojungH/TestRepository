package ch09.exam07;

public class Example2 {
	public static void main(String[] args) {
		//로컬클래스를 정의하고 객체 생성
		class CImple implements A.C{
			@Override
			public void cMethod() {

				System.out.println("CImple-cMethod()");
			}
		}
//		CImple cimple = new CImple();
//		cimple.cMethod();
		
//		A.C c = new CImple();
//		c.cMethod();
		
		//A.C c = new A.C(); //인터페이스는 생성자가 없음 불가..
		A.C c = new A.C(){
			@Override
			public void cMethod() {
				System.out.println("CImple-cMethod()");
				
			}
		};
		c.cMethod();
	}
}
