package ch11.exam07;

import java.util.Map;
import java.util.Set;

public class GetEnvExample {
	public static void main(String[] args) {
		String userName = System.getenv("USERNAME");
		System.out.println(userName );
		
		Map map = System.getenv();
		Set keys = map.keySet();
		
		for(Object objkey : keys){
			String key = (String)objkey;
			String value = System.getenv(key);
			System.out.println("["+key+"]"+value);
		}
	
	}
}
