package ch11.exam02;

public class Key {
	private int number;
	public Key(int number){
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		//넘버가 같으면 넘버를 넘겨주기
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key ){ //멤버 객체가 들어올 경우
			Key target = (Key)obj;
			if(number == target.number ){ //String 내부에서도 .equals()를 재정의하여 문자열비교를 할 수 있도록 해둠
				return true;
			}
		}
		return false;

	}
}
