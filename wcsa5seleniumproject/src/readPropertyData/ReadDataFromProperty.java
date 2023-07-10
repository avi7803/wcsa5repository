package readPropertyData;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		// Read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//Create object of Properties class
		Properties prop = new Properties();
		
		//Make a file ready to read
		prop.load(fis);
		
		//Read the particular property from file
		String data = prop.getProperty("Username");
		
		System.out.println(data);

	}

}
