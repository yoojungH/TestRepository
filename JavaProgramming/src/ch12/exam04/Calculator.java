package ch12.exam04;
//2017.04.07 ���� ����
public class Calculator {
	//Field
	private int memory;
	//Constructor
	
	//Method
	
	


	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { // �� �޼ҵ�� User1�� ������ ���� User2�� ���� ������
		this.memory = memory;
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			
		}
		System.out.println(Thread.currentThread().getName()); // �޸𸮿� ����� ���� �̿�
	}

	
	
	
}
