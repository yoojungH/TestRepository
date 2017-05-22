package ch14.home04;

public class UsingLocalVariable {
	void method(int arg){
		int localVar = 40;
		
		/* final 특성을 가지므로 수정 불가 */
		//arg =31;
		//localVar = 41;
		
		//람다식
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: "+ arg);
			System.out.println("localVar: "+ localVar + "\n");
		};
		
		fi.method();		
	}
}
