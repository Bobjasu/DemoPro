package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Get_Properties {
	
	public String getValue(String value) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/configure/Environment/test.properties");
		Properties prop=new Properties();
		prop.load(fis);
		prop.getProperty(value);
		return value;
		
	}

}
