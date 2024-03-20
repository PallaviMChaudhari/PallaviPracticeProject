package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.switchTo().frame("courses-iframe");
		
		List<WebElement> flist = driver.findElements(By.xpath("(//ul[@class='navigation clearfix'])[1]//li"));
		
		for(WebElement f:flist) {
			String lname = f.getText();
			System.out.println(lname);
			if(lname.equals("All Access Plan")) {
				System.out.println("string match");
				f.click();	
				break;
	   }
			
	}		
		
  }

}
