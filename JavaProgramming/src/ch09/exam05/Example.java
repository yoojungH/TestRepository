package ch09.exam05;

public class Example {
	public static void main(String[] args) {	
		//A.B b = new A.B(); //A�� ���� ��Ȳ���� B�� �� �� ����
		A a = new A();
		A.B b = a.new B(); //A�� ���� ��Ȳ���� B�� �� �� ����
		
		A.C c = new A.C(); //static�̶� A��� ����� �� �ֱ� ������ �׳� �ٿ���
		//A�� ����� CŬ�󽺱��� 
	}
}
