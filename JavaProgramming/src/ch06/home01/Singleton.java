package ch06.home01;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	//Singleton Ÿ���� ��ü�� return�ϴ� �޼ҵ� �Լ�
	static Singleton getInstance(){
		return singleton;
	}
}
