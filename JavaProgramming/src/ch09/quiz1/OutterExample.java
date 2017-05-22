package ch09.quiz1;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		// 内靛累己何
		Outter.Nested nested = outter.new Nested();
		System.out.println(nested.field);
		nested.method();
		
		// 内靛累己何
		System.out.println(outter.field);
		outter.method();
	}
}
