package ch11.exam13;

public class Member implements Comparable<Member> {//멤버는 멤버끼리 비교해야 함.	
	private String name;
	private int age;
	
	public Member(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name +"("+ age+")";
	}

//	@Override
//	public int compareTo(Member o) {
//		return name.compareTo(o.name); //compareTo --- String이 가지고 있음 +++ 사전순 정렬
//	}
//	@Override
//	public int compareTo(Member o) {
//		/*
//		if(age==o.age){
//			return 0;
//		}else if(age>o.age){
//			return 1;
//		}else{
//			return -1;
//		}*/
//		
//		return Integer.compare(age, o.age);
//	}
	
	@Override
	public int compareTo(Member o) {
		String str = ""+age;
		String str2 = ""+o.age;
		
		
		return str.compareTo(str2);
	}
}
