package Parameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Parameter 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Excel Sheets for Selenium\\Param.xlsx");

		Sheet sh1 = WorkbookFactory.create(file).getSheet("Sheet1");
	
		List li = new ArrayList<>();
		
		
		for(int i=0; i<sh1.getLastRowNum(); i++)
		{
			
			int columnNum = sh1.getRow(i).getLastCellNum();
			
			for(int j=0; j< columnNum; j++)
			{
			
				CellType ct = sh1.getRow(i).getCell(j).getCellType();
			
				//System.out.println(ct);
			
				switch(ct)
				{
				case STRING:
					li.add(sh1.getRow(i).getCell(j).getStringCellValue());
					break;
				case NUMERIC:
					li.add(sh1.getRow(i).getCell(j).getNumericCellValue());
					break;
				default:
					break;
				}
				
			}
		}
		
			for(int i=0; i<li.size(); i++)
			{
			System.out.println(li.get(i));
			}
			
	}

}
