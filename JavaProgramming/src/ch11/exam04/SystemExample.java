package ch11.exam04;

public class SystemExample {
	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				//System.out.println("checkExit");  //���� ����  --> �ȵǰ� �Ϸ��� ����
				
				if(status != 54321){
					throw new SecurityException(); //���ܹ߻��ڵ� --> ���� �����̱� ������ throws, try catch�Ⱥٿ��� ��
				}
			}
		});
		
		/*���ܹ߻��ڵ�*/
//		for(int i=0; i<10; i++){
//			System.out.println(i);
//			if(i==5){
//				System.exit(0);
//			}
//		}
		
		/*����ó���ڵ�*/
		for(int i=0; i<10; i++){
			System.out.println(i);
			if(i==5){
				try{
					System.exit(0);
					//System.exit(54321);			
				}catch(SecurityException e){
					
				}
			}
		}
	}
}
