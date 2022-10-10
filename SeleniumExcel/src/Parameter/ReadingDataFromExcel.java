package Parameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Excel Sheets for Selenium\\Selenium.xlsx");
		
		Sheet sheet =  WorkbookFactory.create(file).getSheet("Sheet1");
	
		int rowcount = sheet.getLastRowNum();	//Returns number of Rows
		System.out.println("No. of rows: "+rowcount);
	
		int columncount = sheet.getRow(0).getLastCellNum();		//Returns number of Columns
		System.out.println("No. of columns: "+columncount);
	
		for(int i=0; i<rowcount; i++)
		{
			Row ct = sheet.getRow(i);
			
			for(int j=0; j<columncount; j++)	//Focused on current row
			{
				String value = ct.getCell(j).toString();
				System.out.print("  "+value);
			}
			System.out.println();
		}
		
	}

}
