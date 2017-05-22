package ch11.exam14;

public class WrapperEqualsExample {
	public static void main(String[] args) {
		//Integer v1 = new Integer(10);
		Integer v1 = 1000;
		//Integer v2 = new Integer(10);
		Integer v2 = 1000;
		
		
		//System.out.println(v1 == v2); //기본 타입이 아닐 경우 값 비교로 이걸 쓰지 말것... 번지비교
		//System.out.println(v1.intValue() == v2.intValue());
		System.out.println(v1.equals(v2));
	}
}
