package ch05.exam01;

public class TypeExample01 {
	public static void main(String[] args){
		System.out.println("main() method run...");
		/*기본 타입*/
		byte v1 = 10;
		char v2 = 'A';
		short v3 = 10;
		int v4 = 10;	//10L(8Byte--error! Left hand가 더 넓은 범위여야함)
		long v5 = 10L;
		
		float v6 = 10.0f; //f(4Byte)
		double v7 = 10.0; //default(8Byte)
	
		boolean v8 = true;

		/*참조 타입*/
		String name = "Java";
		int[] scores = {90,80,85};
		
		
	}
}
