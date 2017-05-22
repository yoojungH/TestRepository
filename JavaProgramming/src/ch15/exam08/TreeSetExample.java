package ch15.exam08;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//이것으로 비교해~ 라고 비교자를 넣어주기
		//TreeSet<Person> set = new TreeSet<>(new CompareByName());
		TreeSet<Person> set = new TreeSet<>(new CompareByAge());
		set.add(new Person("홍길동",45));
		set.add(new Person("감자바",55));
		set.add(new Person("박지원",31));

		
		for(Person p : set){
			System.out.println(p.getName() + "("+p.getAge()+")");
		}
		
//		for(Person p : set.descendingSet()){
//			System.out.println(p.getName() + "("+p.getAge()+")");
//		}
	}
}
