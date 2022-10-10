package com.Framework.NopCommerce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityNC 
{
	String projectpath = System.getProperty("user.dir");
	FileInputStream file;
	
	public FileInputStream getFile() throws FileNotFoundException
	{
		file = new FileInputStream(projectpath+"\\Data\\Selenium.xlsx");
		return file;
	}
	
	public Properties getPropertyFile() throws IOException
	{
		Properties pr = new Properties();
		file = new FileInputStream(projectpath+"\\Data\\NCconfig.properties");
		pr.load(file);
		return pr;
	}
	
	
	
	
	
	
	
	
}
