package ch15.exam07;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("ȫ�浿",45));
		set.add(new Person("���ڹ�",25));
		set.add(new Person("������",31));

		
		for(Person p : set){
			System.out.println(p.getName() + "("+p.getAge()+")");
		}
		
//		for(Person p : set.descendingSet()){
//			System.out.println(p.getName() + "("+p.getAge()+")");
//		}
	}
}
