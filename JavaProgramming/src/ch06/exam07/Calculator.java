package ch06.exam07;
/* 인스턴스/Static 비교 */
public class Calculator {
	//Field
	static String model = "MI-84";
	static String makeDay = "2017-03-29";
	static String info; //MI-84(2017-03-29)
	
	/* static 필드의 계산은 static block에서 하기
	    메소드영역에 코드가 다 로딩되면 자동으로 생성  */
	static{
		info = model;
		info += "(";
		info += makeDay;
		info += ")";
	}
	
		
}
