package ch14.exam03;

public class LambdaExpressionExample {
	public static int a=5;
	
	public static void main(String[] args) {
		method1(() -> {
			a=8; //필드 변경 가능 
			System.out.println(a);
		});
		
		final int b = 5; //로컬변수 람다식 안에서 쓸 때는 값을 변경하지 못한다.
		
		method1(()->{
			//b=8; //final 특성을 가짐 -> 못바꿈 /쓰레드-메인이빨리끝나고 run 작업쓰레드에서 뭔지 모름 
			while(true){
				System.out.println(b);
			}
		});
	}	
	
	
	
	public static void method1(FunctionalInterface1 i){
		i.method();
	}

}
