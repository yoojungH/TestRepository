package ch09.exam04;

public class A {
	//Field	
	int field;
	//Constructor
	//Method

	/* 중첩 멤버 클래스 */
	//Nested Class
	//static 안붙어 있으면 A객체가 만들어져야 사용할 수 있다. 따라서 A없이는 사용할 수 없다.
	class B {
		//Field
		int field;
		//Constructor

		//Method
		void method(){
			field = 10; //--- B
			this.field = 10; //나 자기자신 --- B
			A.this.field = 5; //--- A
		}
	} 
		
}
