package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DiffRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\\\Selenium\\\\ExcelSheetReading\\\\ExcelTest2.xlsx");
		Sheet mySheeet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		int row = mySheeet.getLastRowNum();
		short cell1 = mySheeet.getRow(0).getLastCellNum();
		int cell = cell1-1;
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=cell;j++) {
				Cell CellValue = mySheeet.getRow(i).getCell(j);
				CellType type = CellValue.getCellType();
				
				if(type.equals(CellType.STRING)) {
					String value = CellValue.getStringCellValue(); 
					System.out.print(value +" \\ ");
					
				}
				else if(type.equals(CellType.NUMERIC)) {
					double value = CellValue.getNumericCellValue(); 
					System.out.print(value +" \\ ");
					
				}
				if(type.equals(CellType.BOOLEAN)) {
					boolean value = CellValue.getBooleanCellValue(); 
					System.out.print(value +" \\ ");
					
				}
				if(type.equals(CellType.BLANK)) {
					 
					System.out.print( " \\ ");
					
				}
				
			}
			System.out.println();
		}
		
	
	}

}
