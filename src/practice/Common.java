package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Common {
	public static void takeScreenshot(WebDriver driver,File name) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		FileHandler.copy(src, dest);
	}
	
	public static String readExcelsheet(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	public static void takeWait(WebDriver driver,long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));	
	}

	public static String getDatafromeProperty(String key) throws IOException {
		FileInputStream myFile=new FileInputStream("");
		Properties opt=new Properties();
		opt.load(myFile);
		String value = opt.getProperty(key);
		
		return value;
		
	}
}
