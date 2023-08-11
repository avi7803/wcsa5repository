package finalMock;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyData 
{
	public void readPropertyData(String filepath,String browserName) throws IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String data=prop.getProperty(browserName);
		
		System.out.println(data);
		
	}

}
