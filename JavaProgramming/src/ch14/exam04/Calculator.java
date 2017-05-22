package ch14.exam04;

public class Calculator {
	public static int staticSum(int a, int b){
		return a+b;	
	}
	
	public static int staticMulti(int a, int b){
		return a*b;
	}
	
	//static이 아니라면 Calculator 객체 없이 생성할 수 없음!
	public int minus(int a, int b){
		return a-b;
	}
}
