package ch05.exam02;

public class ArrayExample02 {
	public static void main(String[] args) {
		int[] v1 = {10,20,30};
		
		int[] v2;
		v2 = new int[] {10,20,30};
		
		int result1 = sum(v1);
		int result2 = sum(v2);
		int result3 = sum(new int[]{10,20,30});
		
		System.out.println("sum of v1: "+ result1);
		System.out.println("sum of v2: "+ result2);
		System.out.println("sum of new int[]{10,20,30}: "+ result3);
	}
	
	public static int sum(int[] v2) {
		int sum=0;
		for(int i=0; i<v2.length; i++){
			sum += v2[i];
		}
	return sum;	
	}
}
