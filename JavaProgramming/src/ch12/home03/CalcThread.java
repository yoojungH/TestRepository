package ch12.home03;

public class CalcThread extends Thread{
	//�ܺη� ���� �̸��� �޾� ������ ����
	public CalcThread(String name){
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<2000000000; i++) {}
		System.out.println(getName());
	}
	
}
