package ch10.exam04;

import java.io.IOException;

public class ThrowsExample {
//	public static void main(String[] args) throws ClassNotFoundException {
//		Class.forName("");
//}
	
//	public static void main(String[] args) throws ClassNotFoundException,IOException { 
//		Class.forName("");
//		System.in.read();
//	}
	
//	public static void main(String[] args) throws Exception { // JVM�� �⵵�� �ѱ�� --- ���ܸ� �����
//		Class.forName("");
//		System.in.read();
//	}
	
	public static void main(String[] args) { 

		try{
			Class.forName("");
			System.in.read();
		}catch(Exception e){
			//����ó���ڵ�
		}
		
		try{
			divide(10,0);
		}catch(ArithmeticException e){
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		
	}
	
	//static���� static�� �� �� �����ϱ� static �־��ֱ�
//	static void divide(int x, int y){
//		try{
//			int result = x/y;
//		}catch(ArithmeticException e){
//			System.out.println("0���� ������ �ȵ˴ϴ�.");
//		}	
//	}
	
	static void divide(int x, int y) throws ArithmeticException{
			int result = x/y;
	}
	
	
	
}
