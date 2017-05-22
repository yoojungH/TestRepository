package ch06.exam08;
//객체 하나만 생성하고 싶을 때 --- singleton pattern
public class CalculatorExample {
	public static void main(String[] args) {
		//singleton pattern
		//new Calculator();  //접근 못함
		//Calculator.singleton; //접근 가능한데 못하게 막으려면 private
		
		//static으로만 객체 얻을 수 있다.
		Calculator calc1 = Calculator.getInstance();
		Calculator calc2 = Calculator.getInstance();
		
	}
}
