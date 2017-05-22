package ch11.exam01;
//String 처럼 우리가 정의한 Member에도 문자열 비교 할 수 있도록 만들기
public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		//Object이 갖고 있는 거 번지비교
		//equals를 재정의 하여 member만큼은 내용비교하도록
		
	}
}
