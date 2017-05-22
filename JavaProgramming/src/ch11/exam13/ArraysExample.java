package ch11.exam13;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(Arrays.binarySearch(nums, 3));
		
		String[] names = {"ȫ�浿","���ڹ�","�繰���ͳ�"};
		System.out.println(Arrays.binarySearch(names, "���ڹ�2"));
		
		char[] arr1 = {'J','A','V','A'};
		
		//��� 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//��� 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//��� 3 
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1,0,arr4,0,arr1.length);
		for(int i=0;i<arr4.length;i++){
			System.out.println("arr4["+i+"]="+arr4[i]);
		}
	}
}
