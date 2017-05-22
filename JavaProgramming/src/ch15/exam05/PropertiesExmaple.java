package ch15.exam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExmaple {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		String path = PropertiesExmaple.class.getResource("database.properties").getPath();
		//Ŭ������ ���� �ֱ⶧���� ������� ��û�ϰ�
		
		prop.load(new FileReader("D:/IoTCourse/EclipseWorkspace/JavaProgramming/src/ch15/exam05/database.properties"));
		prop.load(new FileReader(path));
		System.out.println(path);
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String manager = prop.getProperty("manager");
		System.out.println(manager);
	}
}
//\uAD00\uB9AC\uC790