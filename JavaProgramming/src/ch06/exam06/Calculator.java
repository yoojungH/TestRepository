package ch06.exam06;
/* 인스턴스/Static 비교 */
public class Calculator {
	//Field
	String field1 = "value1";
	static String field2 = "value2";
	
	//Method
	void method1(){
		System.out.println("method1()");
	}
	static void method2(){
		System.out.println("method2()");
		//System.out.println(field1);  --> 객체를 사용해야만 하는 필드는 사용하지 못함
	}
}
