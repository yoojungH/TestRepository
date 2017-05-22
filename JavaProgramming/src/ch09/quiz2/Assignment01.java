package ch09.quiz2;

public class Assignment01 {
	int field = 10;

	void method01(final int arg) {
		int field1 = 10;
		// int result2 = arg + field;
//		arg = 20;
		
		
		
		class A {

			int field2 = 40;
			void method02(int arg1) {
				field = 10;
				int result = field1 + field2;
				field2 = 30;
				arg1 = 1214210;

				int result2 = arg + arg1;

			}
		}
		A a = new A();
		a.method02(10);
		
	}
	
	
	
}

// 컴파일 에러를 찾아 이유를 설명하고 코드를 수정하시오