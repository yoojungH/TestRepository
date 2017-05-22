package ch11.exam10;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		/* ��ü ��ū �� ���ϰ� for������ ������ ��� */
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens;i++){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		/* hasMoreTokens()�� �����ִ� ��ū ���� �� ���� ��� ��� */
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
