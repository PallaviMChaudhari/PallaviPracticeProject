package practicePOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver=null;
	
	public static void LanuchBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility.readDatafromProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	} 
	
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
