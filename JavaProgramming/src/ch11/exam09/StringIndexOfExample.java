package ch11.exam09;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		
		String input = "";
		
		//��ȿ�� �˻�
		if(!input.equals("")){
			if(subject.indexOf("�ڹ�")!= -1){
				System.out.println("�ڹٿ� ���õ� å�̱���.");
			}else{
				System.out.println("�ڹٿ� �������� å�̱���.");
			}
		}
	}
}
