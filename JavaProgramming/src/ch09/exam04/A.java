package ch09.exam04;

public class A {
	//Field	
	int field;
	//Constructor
	//Method

	/* ��ø ��� Ŭ���� */
	//Nested Class
	//static �Ⱥپ� ������ A��ü�� ��������� ����� �� �ִ�. ���� A���̴� ����� �� ����.
	class B {
		//Field
		int field;
		//Constructor

		//Method
		void method(){
			field = 10; //--- B
			this.field = 10; //�� �ڱ��ڽ� --- B
			A.this.field = 5; //--- A
		}
	} 
		
}
