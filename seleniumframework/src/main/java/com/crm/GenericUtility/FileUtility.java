package com.crm.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{
    public String getPropertyKeyValue(String key) throws IOException
    {
    	FileInputStream fis = new FileInputStream("./data/CommonProperty.properties");
    	Properties prob = new Properties();
    	prob.load(fis);
    	String value = prob.getProperty(key);
		return value;
    	
    	 
    	
    }
}
