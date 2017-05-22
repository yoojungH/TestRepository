package ch05.exam02;

public class ArrayExample03 {
	public static void main(String[] args) {
		//double[] v1 = new double[5];
		//boolean[] v1 = new boolean[5]; //C에서 0인것 처럼..false
		int[] v1 = new int[5];
		v1[0] = 10;
		v1[2] = 10;
		
		String[] v2 = new String[5]; //참조타입변수..null
		v2[0] = new String("Java");
		v2[2] = new String("Java");
		
		System.out.println(v1[0]==v1[2]); //값의 비교
		System.out.println(v2[0]==v2[2]); //번지의 비교(참조 변수)
		System.out.println(v2[0].equals(v2[2]));
		
		for(int i=0; i<v1.length; i++){
			System.out.println("v1["+i+"]: "+v1[i]);
		}
	}
}
