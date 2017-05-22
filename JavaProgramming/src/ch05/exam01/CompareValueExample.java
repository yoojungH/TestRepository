package ch05.exam01;

public class CompareValueExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 =10;
		System.out.println(v1==v2);
		
		int[] v3 = {10};
		int[] v4 ={10};
		int[] v5 = v3;
		System.out.println(v3==v4);
		System.out.println(v3==v5);
		
		String v6 = "Java";
		String v7 = new String("Java");
		//String v7 = v6;
		System.out.println(v6==v7); //객체 자체를 비교
		System.out.println(v6.equals(v7)); //문자열ㄹㄹㅇ랑만을 비교
	}

}
