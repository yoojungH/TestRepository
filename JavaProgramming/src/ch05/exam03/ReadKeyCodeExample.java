package ch05.exam03;
//Ű���� �Է°��� �˰� ���� ��
public class ReadKeyCodeExample {
	public static void main(String[] args) throws Exception {
		int keycode = 0;
		
		System.out.println("---------------------");
		System.out.println("1.���� | 2.�б� | 3.����");
		System.out.println("---------------------");
				
		while(true){		
			if(keycode != 13 && keycode !=10){
				System.out.print("��ȣ����: ");
			}
			keycode = System.in.read();
			switch(keycode){
			case 49:
				System.out.println("������ �����ϼ̽��ϴ�.");
				break;
			case 50:
				System.out.println("�б⸦ �����ϼ̽��ϴ�.");
				break;
			case 51:
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				System.exit(0);
				//return;
				//break;
			}
		}
	}
}
