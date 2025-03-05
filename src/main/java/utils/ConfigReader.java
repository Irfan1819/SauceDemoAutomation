package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
private static Properties properties;

//Load properties file
public static void loadProperties() {
	try {
		FileInputStream file=new FileInputStream("src/test/resources/config.properties");
		properties=new Properties();
		properties.load(file);
	}catch (Exception e) {
	e.printStackTrace();
	throw new RuntimeException("Failed to load config.properties file.");
	}
}
//Get property values
public static String getProperty(String key) {
	if(properties == null) {
		loadProperties();
	}
	return properties.getProperty(key);
}
}
