package ch09.exam02;

public class A {
	//Field
	int aField; //static이 없기 때문에 A 객체가 있어야 사용 가능
	/* 로컬클래스 */
	//Constructor
	A(){
		class D{
			//Field
			//Constructor
			//Method
			void dMethod(){
				aField = 10; //사용 가능하다.
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
				aField = 10; //사용 가능하다.
			}
		}
	}

	
	
	/* 중첩 멤버 클래스 */
	//Nested Class
	class B {
		//Field
		//Constructor
		//Method
		void bMethod(){
			aField = 10; //사용 가능하다.
		}
	} 
	static class C{
		//여기서는 사용하지 못하지만 static을 붙이면 여기서도 사용 가능하다.
	} 

}
