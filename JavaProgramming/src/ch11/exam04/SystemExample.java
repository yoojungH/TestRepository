package ch11.exam04;

public class SystemExample {
	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				//System.out.println("checkExit");  //정상 실행  --> 안되게 하려면 예외
				
				if(status != 54321){
					throw new SecurityException(); //예외발생코드 --> 실행 예외이기 때문에 throws, try catch안붙여도 됨
				}
			}
		});
		
		/*예외발생코드*/
//		for(int i=0; i<10; i++){
//			System.out.println(i);
//			if(i==5){
//				System.exit(0);
//			}
//		}
		
		/*예외처리코드*/
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
