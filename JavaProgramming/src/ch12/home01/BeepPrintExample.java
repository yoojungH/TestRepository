package ch12.home01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		//비프음을 5번 반복해서 소리나게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++){
			toolkit.beep();
			
			//0.5초간 쓰레드를 일시정지 상태로 만들어주기
			try{Thread.sleep(500);}catch(Exception e){}
		}
		
		//'띵'문자열을 5번 출력하는 작업
		for(int i=0; i<5; i++){
			System.out.println("띵");
			//0.5초간 쓰레드를 일시정지 상태로 만들어주기
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
