package ch11.exam03;

import java.util.HashSet;

//String ó�� �츮�� ������ Member���� ���ڿ� �� �� �� �ֵ��� �����
public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		System.out.println(m1.toString());
		System.out.println(m1); //toString �ڵ����� 
		
		String result = m1 + " good!"; //toString �� ȣ���� ��ǥ���ڿ��� ����
		System.out.println(result);
	}
}
