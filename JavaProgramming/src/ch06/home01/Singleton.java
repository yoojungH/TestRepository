package ch06.home01;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	//Singleton 타입의 객체를 return하는 메소드 함수
	static Singleton getInstance(){
		return singleton;
	}
}
