package ch09.exam07;

public class Example2 {
	public static void main(String[] args) {
		//����Ŭ������ �����ϰ� ��ü ����
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
		
		//A.C c = new A.C(); //�������̽��� �����ڰ� ���� �Ұ�..
		A.C c = new A.C(){
			@Override
			public void cMethod() {
				System.out.println("CImple-cMethod()");
				
			}
		};
		c.cMethod();
	}
}
