package ch11.exam13;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		String[] names = {"홍길동","김민수","박동수"};
		
		
		System.out.println(Arrays.toString(names));
		
		//올림차순으로 정렬
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//내림차순으로 정렬
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		
		
		Member[] members = {
//				new Member("홍길동", 20),
//				new Member("김민수", 15),
//				new Member("박동수", 25)
				new Member("정세미", 25),
				new Member("장성근", 200),
				new Member("세종대왕", 620)
		};
		
		
		System.out.println("-------------------------");
		//Member 클래스에서 toString을 재정의 해야 이름 얻을 수 있음
		System.out.println(Arrays.toString(members));
		
		//올림차순
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		
		
		//클래스라면 상속해야하고 인터페이스라면 구현해야함. Comparable 은 인터페이스
		//Comparable com =  new Member(); 
		//멤버 클래스에 compa 구현
		
		//내림차순
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
		
		/* 나이순으로 정렬하시오 */
		
		
		
		
	}
}
