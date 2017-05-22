package ch11.exam03;

import java.util.HashSet;

//String 처럼 우리가 정의한 Member에도 문자열 비교 할 수 있도록 만들기
public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		System.out.println(m1.toString());
		System.out.println(m1); //toString 자동으로 
		
		String result = m1 + " good!"; //toString 을 호출한 대표문자열과 결합
		System.out.println(result);
	}
}
