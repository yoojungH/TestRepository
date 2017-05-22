package ch11.exam10;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		/* 전체 토큰 수 구하고 for문으로 돌리는 방법 */
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens;i++){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		/* hasMoreTokens()로 남아있는 토큰 있을 때 까지 찍는 방법 */
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
