package ch11.exam02;

import java.util.HashSet;

//String ó�� �츮�� ������ Member���� ���ڿ� �� �� �� �ֵ��� �����
public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		
		//������ �ٸ��� �ؽ��ڵ尡 �ٸ��� ����
		//���� �񱳸� �Ҷ� �ؽ��ڵ带 ���� �������� 
		//hashmap, hashSet, hashTable�� ���� �÷����� ����� �� 
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		HashSet hashSet = new HashSet();
		//hashcode�� �ٸ��� ������ 2��
		hashSet.add(m1);
		hashSet.add(m2);
		System.out.println(hashSet.size());
	}
}
