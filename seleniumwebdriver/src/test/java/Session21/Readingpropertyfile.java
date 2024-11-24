package Session21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Readingpropertyfile {

	public static void main(String[] args) throws IOException  {
		
		//create object of property class
		Properties propertyobject  = new Properties();
		
		//specify the location of file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\config.properties");
		
		//load the property file
		propertyobject.load(file); 
		
		//reading data from properties file 
		String url = propertyobject.getProperty("appurl");
		String email = propertyobject.getProperty("email");
		String password = propertyobject.getProperty("password");
		String orderid = propertyobject.getProperty("orderid");
		String customerid = propertyobject.getProperty("customerid");
		
		System.out.println(url+" " +email+"  " +password+" " +orderid+" " +customerid+" ");
		
		//reading all the keys from property file
	Set<String>	 keys =propertyobject.stringPropertyNames(); //this method will collect all keys of property file and return in string file
	System.out.println(keys);
	
	//reading all values
	Collection<Object> values = propertyobject.values();
	System.out.println(values);
	
	file.close();
	
	}
	

}
