package ch11.exam01;
//객체의 아이디 비교하는 메소드
public class Member {
	//Field
	private String id;
	//Constructor
	public Member(String id){
		this.id = id;
	}
	//Method
	@Override
	//(Object obj)로 들어올 수 있는 객체는? Object을 상속받는 객체들 , 즉 모든 객체가 다 들어올 수 있다.
	public boolean equals(Object obj) {
		if(obj instanceof Member){ //멤버 객체가 들어올 경우
			Member target = (Member)obj;
			
//			if(id.equals(target.id)){ //String 내부에서도 .equals()를 재정의하여 문자열비교를 할 수 있도록 해둠
//				return true;
//			}else{
//				return false;
//			}
//		}else{
//			return false;
//			//멤버 객체가 아닐경우 제외
//		}
			
			if(id.equals(target.id)){ //String 내부에서도 .equals()를 재정의하여 문자열비교를 할 수 있도록 해둠
				return true;
			}
		}
		return false;
		//1. 문자열이 다를 경우 false return 2. 멤버 객체가 아닐경우 제외

	}
}
