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
	
//	public static void main(String[] args) throws Exception { // JVM이 잡도록 넘기기 --- 예외를 출력함
//		Class.forName("");
//		System.in.read();
//	}
	
	public static void main(String[] args) { 

		try{
			Class.forName("");
			System.in.read();
		}catch(Exception e){
			//예외처리코드
		}
		
		try{
			divide(10,0);
		}catch(ArithmeticException e){
			System.out.println("다시 입력하세요.");
		}
		
	}
	
	//static에는 static만 들어갈 수 있으니까 static 넣어주기
//	static void divide(int x, int y){
//		try{
//			int result = x/y;
//		}catch(ArithmeticException e){
//			System.out.println("0으로 나누면 안됩니다.");
//		}	
//	}
	
	static void divide(int x, int y) throws ArithmeticException{
			int result = x/y;
	}
	
	
	
}
