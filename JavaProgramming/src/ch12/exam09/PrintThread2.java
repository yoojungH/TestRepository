package ch12.exam09;

public class PrintThread2 extends Thread{
	//�ʵ�
	//������
	//�޼ҵ�
	
	public void run(){
		try{
			while(true){ //stop �÷��� ���
				System.out.println("���� ��...");
				System.out.println("���� ��...");
				//how1
				//Thread.sleep(1);  //�Ͻ����� �߻���Ű��. 1000���� 1��
				
				//how2
				if(isInterrupted()){ //interrupted�޼ҵ尡 ȣ��Ǹ� true ��.
					break;
				}
			}
			
		}catch(Exception e){ //�����ӹ߻��ϸ� ����� �Ѿ��
			
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

//��,�� Thread.interrupted() ---> static�̶� �ۿ��� ���� 
//�� isInterrupted()
