package ch12.exam10;

public class AutoSaveThread extends Thread{
	
	public void save(){
		System.out.println("�۾� ������ ������");
	}
	
	@Override
	public void run() {
		while(true){
		//�� 1�ʸ��� ���� 
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
		} 
		save();
		}	
	}
}

	