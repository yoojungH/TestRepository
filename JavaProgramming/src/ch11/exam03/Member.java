package ch11.exam03;
//객체의 아이디가 같으면 중복 저장 안되게 하기 --- hashcode를 이용해서
public class Member {
	//Field
	private String id;
	//Constructor
	public Member(String id){
		this.id = id;
	}
	//Method
	@Override
	public String toString() {
		return id;
	}
}
