package ch14.home02;

public class MyFunctionInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi= (x) -> {
			int result = x*5;
			System.out.println(result);
		};
		
		fi.method(2);
		
		fi = (x) -> {
			System.out.println(x*5);
		};
		
		fi.method(2);
		
		fi = (x) -> System.out.println(x*5);
	
		fi.method(2);
	}
}
