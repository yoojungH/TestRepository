package ch06.exam09;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("홍길동","111112-2312394");
		
		//멤버에 접근하여 값을 변경할 수 있음
		member.name = "김자바";
		
		//멤버에 접근하여 값을 변경할 수 없음
		//member.ssn = "222222-5252223";
	}
}
