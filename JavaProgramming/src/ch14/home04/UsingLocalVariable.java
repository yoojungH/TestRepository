package ch14.home04;

public class UsingLocalVariable {
	void method(int arg){
		int localVar = 40;
		
		/* final Ư���� �����Ƿ� ���� �Ұ� */
		//arg =31;
		//localVar = 41;
		
		//���ٽ�
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: "+ arg);
			System.out.println("localVar: "+ localVar + "\n");
		};
		
		fi.method();		
	}
}
