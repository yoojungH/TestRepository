package ch11.exam02;

import java.util.HashSet;

//String 처럼 우리가 정의한 Member에도 문자열 비교 할 수 있도록 만들기
public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		
		//번지가 다르면 해시코드가 다르게 나옴
		//동등 비교를 할때 해시코드를 같게 만들어야함 
		//hashmap, hashSet, hashTable과 같은 컬렉션을 사용할 때 
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		HashSet hashSet = new HashSet();
		//hashcode가 다르기 때문에 2개
		hashSet.add(m1);
		hashSet.add(m2);
		System.out.println(hashSet.size());
	}
}
