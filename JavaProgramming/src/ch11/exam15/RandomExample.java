package ch11.exam15;

import java.util.Random;

//0<= x <1
public class RandomExample {
	public static void main(String[] args) {
		//int dice = 6;  
		int maxNum = 6;
		double random = Math.random()*maxNum + 1;	
		System.out.println((int)random);
		
		double rand = Math.random();
		int num = (int)(rand*maxNum) + 1;
		System.out.println(num);
		
		Random obj = new Random();
		int num2 = obj.nextInt(maxNum)+1;
		System.out.println(num2);
	}
}
