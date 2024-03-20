package practicePOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream myFile =new FileInputStream("D:\\Excel.xlsx  ");
		Cell cellvalue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell);
		String value = cellvalue.getStringCellValue();
		System.out.println(value);
		return value;
	}
	
	public static void waitMethod(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
	}
	
	public static void takeScreenShot(WebDriver driver,File myFile) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Screenshot\\"+myFile+".png");
		FileHandler.copy(src, dest);
	}
	
	public static String readDatafromProperty(String key) throws IOException {
		FileInputStream myFile =new FileInputStream("C:\\Users\\Palya\\Practice\\SeleniumPractice\\PropertyFile.Properties");
		Properties opt=new Properties();
		opt.load(myFile);
	    String value = opt.getProperty(key);
		return value; 
	}

}
