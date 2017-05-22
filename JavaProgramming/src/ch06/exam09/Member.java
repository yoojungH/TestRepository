package ch06.exam09;

public class Member {
	String name;
	final String ssn; 
	//final == 생성자를 통해서 딱 한번의 변경기회를 주고 그 이후부터는 바꿀 수 없음
	//생성자로 값 주고 싶으면 미리 값을 넣어도 안됨..
	
	static final String NATION ="한국";
	//상수 static final로 선언된 필드는 대문자로 작성!!
	//static -- 멤버 객체 안에 만들어지지 않고 클래스 안에만
	//final  -- 값을 바꿀 수 없음
	//static{ } 안에서는 한번은 가능하지나 잘 쓰지 않음
	
	Member(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		
		
	}
}
