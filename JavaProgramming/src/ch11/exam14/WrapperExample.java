package ch11.exam14;

public class WrapperExample {
	public static void main(String[] args) {
		int v1 = 10;
		Integer v2 = 10; //10�� ������ �ִ� integer��ü�� ���� --- auto boxing
		int v3 = v2; //v2�� ������ �ִ� ���� ������ v3�� ���� --- auto unboxing

		method1(3); //auto boxing
		int v4 = method2(); //�ڵ� ��ڽ� auto unboxing
	}
	public static void method1(Integer obj){}
	//public static void method1(Object obj){}
	public static Integer method2(){return 1;}
	
	
}
