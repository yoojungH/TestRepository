package ch09.exam02;

public class A {
	//Field
	int aField; //static�� ���� ������ A ��ü�� �־�� ��� ����
	/* ����Ŭ���� */
	//Constructor
	A(){
		class D{
			//Field
			//Constructor
			//Method
			void dMethod(){
				aField = 10; //��� �����ϴ�.
			}
		}
		
	}

	//Method
	void aMethod(){
		class E{
			//Field
			//Constructor
			//Method
			void eMethod(){
				aField = 10; //��� �����ϴ�.
			}
		}
	}

	
	
	/* ��ø ��� Ŭ���� */
	//Nested Class
	class B {
		//Field
		//Constructor
		//Method
		void bMethod(){
			aField = 10; //��� �����ϴ�.
		}
	} 
	static class C{
		//���⼭�� ������� �������� static�� ���̸� ���⼭�� ��� �����ϴ�.
	} 

}
