package ch07.exam04;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("김","자바");
		System.out.println(child.lastName);	
		System.out.println(child.firstName);
		child.sound();
		child.play();
		
		//부모의 sound호출
		child.parentSound();
	}
}
