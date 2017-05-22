
package ch14.exam07;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {

		method1((a) -> {return (int)a;});
		method1((a) -> (int)a);
		
		method1((a) -> {return (int)Math.round(a);});
		method2((m) -> {return m.getMid();});
		method2((m) -> {return m.getMname();});
	}
	
	public static void method1(DoubleToIntFunction arg){
		int result = arg.applyAsInt(3.54);
		System.out.println(result);
	}
	
	//<매개타입,리턴타입> 어떤 값을 넣느냐에 따라 결과가 달라짐(다형성)
	public static void method2(Function<Member,String> arg){
		Member member = new Member("white", "홍길동");
		String result = arg.apply(member);
		System.out.println(result);
	}
	
		

}
