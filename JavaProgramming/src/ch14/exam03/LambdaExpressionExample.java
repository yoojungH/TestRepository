package ch14.exam03;

public class LambdaExpressionExample {
	public static int a=5;
	
	public static void main(String[] args) {
		method1(() -> {
			a=8; //�ʵ� ���� ���� 
			System.out.println(a);
		});
		
		final int b = 5; //���ú��� ���ٽ� �ȿ��� �� ���� ���� �������� ���Ѵ�.
		
		method1(()->{
			//b=8; //final Ư���� ���� -> ���ٲ� /������-�����̻��������� run �۾������忡�� ���� �� 
			while(true){
				System.out.println(b);
			}
		});
	}	
	
	
	
	public static void method1(FunctionalInterface1 i){
		i.method();
	}

}
