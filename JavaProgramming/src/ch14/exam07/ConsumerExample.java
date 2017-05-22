package ch14.exam07;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		
/*---------------------------------------------------------*/		
		method1(new Consumer<String>(){
			@Override
			public void accept(String t) {
				for(int i=0; i<5; i++){
					System.out.println(t);
				}
			}
		});
/*---------------------------------------------------------*/			
		method1((s)->{
			for(int i=0; i<5; i++){
				System.out.println("����: "+ s);
			}
		});
/*---------------------------------------------------------*/	
		method1(s -> System.out.println("����: "+ s));

		method2((s1, s2) -> {
			System.out.println(s1 + "-" + s2);
		});
		
		method2( (a,b) -> System.out.println(a+"-"+b));
	
		
		method3((s,a) -> {
			for(int k=0; k<a; k++)
				System.out.println(s+"["+(k+1)+"]");
		});
	}
	
		
	
	public static void method1(Consumer<String> arg){
		arg.accept("JAVA");
	}
	
	public static void method2(BiConsumer<String, String> arg){
		arg.accept("IoT", "Java");
	}

	public static void method3(ObjIntConsumer<String> arg){
		arg.accept("ȫ�浿", 20);
	}

}
