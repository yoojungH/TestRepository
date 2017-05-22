package ch14.exam03;

@FunctionalInterface  // 컴파일러가 해당 인터페이스가 가지고 있는 메소드가 하나인지 확인해준다.
public interface FunctionalInterface1 {
	public void method();
	// (X) public void method2();
	
}
