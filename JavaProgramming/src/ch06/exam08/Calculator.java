package ch06.exam08;
/* 인스턴스/Static 비교 */
public class Calculator {
	//자기 자신 필드
	private static Calculator singleton = new Calculator();
	
	//생성자가 생성되지 못하도록 Block -- 외부에서 사용할 수 없음
	private Calculator(){
		
	}
	
	//오직 이것만 접근 가능
	//return type이 Calculator...
	static Calculator getInstance(){
		return singleton;
	}
		
}
