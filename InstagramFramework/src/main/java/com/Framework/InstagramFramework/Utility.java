package com.Framework.InstagramFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility 
{
	String projectPath = System.getProperty("user.dir");
	FileInputStream file;
		
	//For Excel File
	public FileInputStream getFile() throws FileNotFoundException
	{
		file = new FileInputStream(projectPath+"\\Data\\Selenium.xlsx");
		return file;
	}
	
	//For config.properties file
	public Properties getPropertyFile() throws IOException
	{
		Properties pr = new Properties();
		file = new FileInputStream(projectPath+"\\Data\\config.properties");
		pr.load(file);
		return pr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
