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
		
		//현재는 다른 걸로 인지하여 둘다 map에 저장함 ---> hashMap 재정의 필요 1. 해시코드 2. equals 
		//재정의 하면 2 -> 1
		
		System.out.println(hashMap.size());
	}
}


//입사시험!!! 두 객체를 동등비교 하는 방법을 구현해보세요.