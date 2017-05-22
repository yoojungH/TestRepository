package ch12.home01;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		/* how 1 */
//		//BeepThread thread = new BeepThread();
//		//이렇게 해도 되지만 부모클래스에 넣음
//		Thread thread = new BeepThread();
//		thread.start();
		
		/* how 2 --- 익명객체로 생성 */
		Thread thread = new Thread(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++){
					toolkit.beep();
						
					//0.5초간 쓰레드를 일시정지 상태로 만들어주기
					try{Thread.sleep(500);}catch(Exception e){}
				}
			}
		};
		
		
		/* Main Thread 가 실행하는 작업*/
		//'띵'문자열을 5번 출력하는 작업
		for(int i=0; i<5; i++){
			System.out.println("띵");
			//0.5초간 쓰레드를 일시정지 상태로 만들어주기
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
