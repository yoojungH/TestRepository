package ch12.exam10;
//�� thread�� ������ ���� thread�� �װ� ����� ���
public class DaemonExample {
	public static void main(String[] args) {
		System.out.println("���� ���μ����� ������");

		//�ڵ����� �����ϴ� ������ ����
		AutoSaveThread thread = new AutoSaveThread();
		
		 //[�߰�] : ���佺���带 ���ν������� ���� ������� ����� 
		thread.setDaemon(true); 
		
		
		thread.start();
		//���μ��� ������� �ʰ� ��� �����.
		
		try{Thread.sleep(5000);}catch(Exception e){}
		
		System.out.println("���� ���μ����� ������");

	
	}
}
