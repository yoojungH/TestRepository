package ch15.exam07;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("홍길동",45));
		set.add(new Person("감자바",25));
		set.add(new Person("박지원",31));

		
		for(Person p : set){
			System.out.println(p.getName() + "("+p.getAge()+")");
		}
		
//		for(Person p : set.descendingSet()){
//			System.out.println(p.getName() + "("+p.getAge()+")");
//		}
	}
}
