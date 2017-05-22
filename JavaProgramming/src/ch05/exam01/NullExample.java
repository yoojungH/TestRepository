package ch05.exam01;

public class NullExample {
	public static void main(String[] args) {
		String v1 = null;
		
		String v2;
		v2= null;
	
		int[] v3 = null; //변수는 생성되었으나 배열을 참조하고 있지 않다.
		
		if(v1==null){
			System.out.println("null");
		}
//		else(v3 != null){
//			System.out.println("not null");
//		}
		
	}
}
