package ch06.exam08;
//��ü �ϳ��� �����ϰ� ���� �� --- singleton pattern
public class CalculatorExample {
	public static void main(String[] args) {
		//singleton pattern
		//new Calculator();  //���� ����
		//Calculator.singleton; //���� �����ѵ� ���ϰ� �������� private
		
		//static���θ� ��ü ���� �� �ִ�.
		Calculator calc1 = Calculator.getInstance();
		Calculator calc2 = Calculator.getInstance();
		
	}
}
