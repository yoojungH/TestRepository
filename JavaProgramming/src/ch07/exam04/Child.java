package ch07.exam04;

public class Child extends Parent{
//	//Field
//	String firstName = "자바";
//	//Constructor
//
//	Child(){
//		super("김");
//		System.out.println("Child 객체 생성");
//	}
	
	//Field
	String firstName;
	//Constructor

	Child(String lastName, String firstName){
		super(lastName);
		this.firstName = firstName;
	}
	
	
	//Method
	//부모의 접근 제한자보다 더 낮은 접근제한자 올 수 없다.
	//보통 재정의 할 때 부모랑 똑같이 함
	void play(){
		System.out.println("놀아요!");
	}
	
//	@Override
//	void sound(){
//		System.out.println("낄낄");
//	}
	
	@Override
	void sound() {

	}
	
	/* 부모의 메소드를 호출할 수 있는 방법 */
	void parentSound(){
		super.sound();
		////child 자기자신의 sound
		//sound();
	}
	
}
