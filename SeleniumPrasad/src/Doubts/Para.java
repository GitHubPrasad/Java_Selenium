package Doubts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\JAVA\\Excel Sheets for Selenium\\First.xlsx");
		
		Sheet sh1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String str = sh1.getRow(1).getCell(1).getStringCellValue();
		
		//System.out.println(sh1.getLastRowNum());
		
		System.out.println(str);

	}

}
