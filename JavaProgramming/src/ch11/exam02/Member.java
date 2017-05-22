package ch11.exam02;
//객체의 아이디가 같으면 중복 저장 안되게 하기 --- hashcode를 이용해서
public class Member {
	//Field
	private String id;
	//Constructor
	public Member(String id){
		this.id = id;
	}
	//Method
	//1. 해쉬코드 재정의
	@Override
	public int hashCode() {
		//문자열이 같으면 동일한 해시코드가 나옴
		return id.hashCode();
	}
	
	
	//2. equals 재정의
	@Override
	//(Object obj)로 들어올 수 있는 객체는? Object을 상속받는 객체들 , 즉 모든 객체가 다 들어올 수 있다.
	public boolean equals(Object obj) {
		if(obj instanceof Member){ //멤버 객체가 들어올 경우
			Member target = (Member)obj;
			if(id.equals(target.id)){ //String 내부에서도 .equals()를 재정의하여 문자열비교를 할 수 있도록 해둠
				return true;
			}
		}
		return false;
		//1. 문자열이 다를 경우 false return 2. 멤버 객체가 아닐경우 제외

	}
}
