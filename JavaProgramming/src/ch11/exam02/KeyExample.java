package ch11.exam02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		
		Key k1 = new Key(10);
		Member m1 = new Member("blue");
		hashMap.put(k1, m1);
		
		Key k2 = new Key(10);
		Member m2 = new Member("white");
		hashMap.put(k2, m2);
		
		//����� �ٸ� �ɷ� �����Ͽ� �Ѵ� map�� ������ ---> hashMap ������ �ʿ� 1. �ؽ��ڵ� 2. equals 
		//������ �ϸ� 2 -> 1
		
		System.out.println(hashMap.size());
	}
}


//�Ի����!!! �� ��ü�� ����� �ϴ� ����� �����غ�����.