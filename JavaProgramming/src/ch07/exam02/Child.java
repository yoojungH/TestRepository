package ch07.exam02;

public class Child extends Parent{
//	//Field
//	String firstName = "�ڹ�";
//	//Constructor
//
//	Child(){
//		super("��");
//		System.out.println("Child ��ü ����");
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
		System.out.println("��ƿ�!");
	}
}
