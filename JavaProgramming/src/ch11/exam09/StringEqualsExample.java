package ch11.exam09;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("½Å¹ÎÃ¶");
		String strVar2 = "½Å¹ÎÃ¶";
		
		if(strVar1 == strVar2){
			System.out.println("°°Àº String °´Ã¼¸¦ ÂüÁ¶");
		}else{
			System.out.println("´Ù¸¥ String °´Ã¼¸¦ ÂüÁ¶");
		} 
		
		
	}
}
