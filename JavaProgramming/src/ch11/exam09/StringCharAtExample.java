package ch11.exam09;
//p.499
public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010634-1230123";
		char sex = ssn.charAt(7);
		
		switch(sex){
			case '1':
			case '3':
				System.out.println("���� �Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("���� �Դϴ�.");
				break;
		
		
		}
	}
}
