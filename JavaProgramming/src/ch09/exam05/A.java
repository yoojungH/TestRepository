
package ch09.exam05;

public class A {
	//Field	
	int field;
	//Constructor
	//���� Ŭ������ static �� ����
	A(){
		class D{}
		D d = new D();
	}
	//�޼ҵ尡 �ʹ� �� �� �޼ҵ� �ȿ��� ����ϱ� ����
	//�����ڰ� ���� �� ������ �������
	
	//Method
	void method(){
		class E{}
		E e = new E();
	}
	//�޼ҵ尡 ���� �� ������ �������
	
	

	/* ��ø ��� Ŭ���� */
	//Nested Class
	//static �Ⱥپ� ������ A��ü�� ��������� ����� �� �ִ�. ���� A���̴� ����� �� ����.
	class B {} //static �Ⱥپ� ������ A��ü�� ��������� ����� �� �ִ�. ���� A���̴� ����� �� ����.
	static class C{} //��ü �ȿ� �ȵ��� Ŭ�����ȿ� ����. Ŭ���� �̸������� ������ �� �ִ�. 
		
}