package ch10.exam01;

import java.util.Scanner;

public class RuntimeExceptionExample {
	public static void main(String[] args) {
		try{
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e){
			System.out.println(e.getMessage()); //에러의 원인을 문자열로 반환
		}finally{//무조건 실행되는 부분(옵션)
			System.out.println("정상적으로 실행되도록 함");
		}

		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("입력: ");
			String strNum = scanner.nextLine();
			
			try{
				int num = Integer.parseInt(strNum);
			}catch(NumberFormatException e){
				System.out.println("숫자만 입력하세요~");
			}
		}
	}
}
