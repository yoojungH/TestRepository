package ch06.exam05;
//��� ��Ű���� �ִ��� 
//http://post.naver.com/viewer/postView.nhn?
//volumeNo=6164624&memberNo=25041664&searchKeyword=%EC%9C%A0%EB%A7%9D%EC%A7%81%EC%97%85&searchRank=11&mainMenu=FINANCE
import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) throws Exception{
		Member[] members = new Member[100];
	
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("-------------------------------");	
			System.out.println("1. ȸ������  |  5. ����  ");
			System.out.println("-------------------------------");	
			
			System.out.print("����: ");
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")){
				String name = scanner.nextLine();
				int age = Integer.parseInt(scanner.nextLine());
//				System.out.println("�̸�: "+name);
//				System.out.println("����: "+age);
				Member member = new Member(name,age);
				
				for(int i=0; i<members.length; i++){
					if(members[i]==null){
						members[i]=member; //member��ü�� ������ ��
						break;
					}
				}
				
			}else if(strNum.equals("5")){
				System.exit(0);
			}
				
			
			
			
			
//			switch(strNum){
//			case "1":
//				System.out.println("1. ȸ������");
//				break;
//			case "5":
//				System.exit(0); //JVM�� �����Ű�� �ڵ�
//				break;
//			}
			
		}
		
		
		//while(true){
//			int keyCode = System.in.read();
//			System.out.println(keyCode);
			
//			Scanner scanner = new Scanner(System.in);
//			int num = scanner.nextInt();
//			System.out.println(num);
//			String str = scanner.nextLine();
//			System.out.println(str);
//	}
	}
}
