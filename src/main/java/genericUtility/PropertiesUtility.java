package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author 91776
 * version 28.02.2025
 */
public class PropertiesUtility {
	/**
	 * 
	 * @this is a generic method to fetch a data from properties file
	 * @return
	 * @throws IOException
	 */
public String getDataFromPropertiesFile(String key) throws IOException
{
	FileInputStream fis=new FileInputStream(IPathUtility.propertiesPath);
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty(key);
	return value;
}
}
