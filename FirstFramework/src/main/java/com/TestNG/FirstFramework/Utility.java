package com.TestNG.FirstFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility
{
		String projectpath = System.getProperty("user.dir");
		FileInputStream file;
	
	public FileInputStream getFile() throws EncryptedDocumentException, IOException
	{
		file = new FileInputStream(projectpath+"//Data//Param.xlsx");
				
		return file;
	}
	
	//Get data from config.properties file
	public Properties getPropertyFile() throws IOException
	{
		Properties pr = new Properties();
		file = new FileInputStream(projectpath+"\\Data\\config.properties");
		pr.load(file);
		return pr;
	
	}
	
}
