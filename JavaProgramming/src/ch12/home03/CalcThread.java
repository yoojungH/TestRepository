package ch12.home03;

public class CalcThread extends Thread{
	//외부로 부터 이름을 받아 쓰레드 생성
	public CalcThread(String name){
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<2000000000; i++) {}
		System.out.println(getName());
	}
	
}
