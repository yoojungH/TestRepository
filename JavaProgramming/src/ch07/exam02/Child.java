package ch07.exam02;

public class Child extends Parent{
//	//Field
//	String firstName = "ÀÚ¹Ù";
//	//Constructor
//
//	Child(){
//		super("±è");
//		System.out.println("Child °´Ã¼ »ý¼º");
//	}
	
	//Field
	String firstName;
	//Constructor

	Child(String lastName, String firstName){
		super(lastName);
		this.firstName = firstName;
	}
	
	
	//Method
	void play(){
		System.out.println("³î¾Æ¿ä!");
	}
}
