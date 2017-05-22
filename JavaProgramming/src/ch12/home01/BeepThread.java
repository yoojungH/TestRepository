package ch12.home01;

import java.awt.Toolkit;

/* 쓰레드의 하위 클래스 */
public class BeepThread extends Thread{
	 @Override
	public void run() {
		//비프음을 5번 반복해서 소리나게 하는 작업
			Toolkit toolkit =Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++){
				toolkit.beep();
					
				//0.5초간 쓰레드를 일시정지 상태로 만들어주기
				try{Thread.sleep(500);}catch(Exception e){}
			}
	}
}
