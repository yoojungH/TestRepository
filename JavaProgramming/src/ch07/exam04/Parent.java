package ch07.exam04;

public class Parent {
	//Field
	//String lastName = "��";
	String lastName;

	//Constructor
	Parent(String lastName){
		this.lastName=lastName;
	}
	Parent(){
		System.out.println("Parent ��ü ����");
	}
	//Method
	void sound(){
		System.out.println("����");
	}
}
