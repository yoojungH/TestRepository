package ch11.exam16;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
//		System.out.println(now.getYear());
//		System.out.println(now.getMonth());
//		System.out.println(now.getDate());
//		System.out.println(now.getDay());
//		System.out.println(now.getHours());
//		System.out.println(now.getMinutes());
//		System.out.println(now.getSeconds());
		
		//Calendar --- protected 객체 생성 못함 / 자기자신 return 하는 getInstance()
		//Calendar cal = Calendar.getInstance(Locale.KOREA);
		//Calendar cal = Calendar.getInstance(TimeZone.getTimeZone());
	
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int  month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
	
		System.out.println(year +"-"+month+"-"+date);
	}
}
