package ch06.exam06;
/* �ν��Ͻ�/Static �� */
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
		//System.out.println(field1);  --> ��ü�� ����ؾ߸� �ϴ� �ʵ�� ������� ����
	}
}
