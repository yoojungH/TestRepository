package ch15.exam08;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//�̰����� ����~ ��� ���ڸ� �־��ֱ�
		//TreeSet<Person> set = new TreeSet<>(new CompareByName());
		TreeSet<Person> set = new TreeSet<>(new CompareByAge());
		set.add(new Person("ȫ�浿",45));
		set.add(new Person("���ڹ�",55));
		set.add(new Person("������",31));

		
		for(Person p : set){
			System.out.println(p.getName() + "("+p.getAge()+")");
		}
		
//		for(Person p : set.descendingSet()){
//			System.out.println(p.getName() + "("+p.getAge()+")");
//		}
	}
}
