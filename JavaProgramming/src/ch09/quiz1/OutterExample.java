package ch09.quiz1;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		// �ڵ��ۼ���
		Outter.Nested nested = outter.new Nested();
		System.out.println(nested.field);
		nested.method();
		
		// �ڵ��ۼ���
		System.out.println(outter.field);
		outter.method();
	}
}
