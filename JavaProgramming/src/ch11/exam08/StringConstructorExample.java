package ch11.exam08;

public class StringConstructorExample {
	public static void main(String[] args) throws Exception {
		String s1 = "abc";
		String s2 = new String("abc");
		
		char[] charArray = {'a','b','c'};
		String s3 = new String(charArray);
	
		byte[] byteArray = {49,50,51}; //문자로 변환되어서 1, 2, 3 이 출력됨
		String s4 = new String(byteArray);
		System.out.println(s4);
		
//		byte[] inputData = new byte[100];
//		int readByteNo = System.in.read(inputData); //한번에 한개만 읽음
//		String strData = new String(inputData,0,readByteNo-2); //0부터 뒤에 엔터(10,13)전까지 읽음
//		System.out.println(strData);
		
		byte[] byteArray2 = {49, 50, 51, 52, 53, 54, 55};
		String strData2 = new String(byteArray2, 3, 3);
		System.out.println(strData2);
		
	
	}
}
