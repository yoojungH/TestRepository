package ch09.exam08;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();
		//�� �������̽��� ������ ������ ���� ��ü�� ����
		button.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick() {
				System.out.println("������ �����մϴ�.+");	
			}
		});
		button.touch();
		
		
	}
}
