package ch10.exam03;

public class CatchByExceptionKindExample2 {
	public static void main(String[] args) {
	
		try{
			//String str = null;
			String str = "ab";
			System.out.println(str.length());
			
			int[] scores = {90, 85};
			for(int i=0;i<2;i++){
				System.out.println(scores[i]);
			}

			String strNum = "a";
			int num = Integer.parseInt(strNum);
		}catch(NullPointerException | ArrayIndexOutOfBoundsException e){
			System.out.println("�����ڵ�ó��1");
		}catch(NumberFormatException e){
			System.out.println("�����ڵ�ó��2");
		}
		
		
//		catch(Exception e){
//			System.out.println("����ó���߻�");
//		}
	}
}
