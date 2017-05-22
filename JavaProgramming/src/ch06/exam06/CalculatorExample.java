package ch06.exam06;

public class CalculatorExample {
	public static void main(String[] args) {
		System.out.println(Calculator.field2);
		Calculator.method2();
		
		
		//인스턴스 필드,메소드는 객체를 만들어야 사용할 수 있다.
		Calculator calc = new Calculator();
		System.out.println(calc.field1);
		calc.method1();
	}
}
