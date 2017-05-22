package ch11.exam14;

public class WrapperExample {
	public static void main(String[] args) {
		int v1 = 10;
		Integer v2 = 10; //10을 가지고 있는 integer객체를 대입 --- auto boxing
		int v3 = v2; //v2가 가지고 있는 식을 꺼내어 v3에 대입 --- auto unboxing

		method1(3); //auto boxing
		int v4 = method2(); //자동 언박싱 auto unboxing
	}
	public static void method1(Integer obj){}
	//public static void method1(Object obj){}
	public static Integer method2(){return 1;}
	
	
}
