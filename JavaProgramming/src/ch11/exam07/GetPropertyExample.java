package ch11.exam07;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("userName");
		String userHome = System.getProperty("userHome");
		
		System.out.println("[os.name]"+osName);
		
		
//		Properties props = System.getProperties();
//		Set keys = props.keySet();
//		
//		for(Object objkey : keys){
//			String key = (String)objkey;
//			String value = System.getProperty(key);
//			System.out.println("["+key+"]"+value);
//		}
		
	}
}
