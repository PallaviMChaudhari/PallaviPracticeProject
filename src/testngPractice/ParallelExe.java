package testngPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExe {
	WebDriver driver=null;
	@Parameters("bName")
  @Test
  public void CrossBrow(String bName) {
		if(bName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(bName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
  }
}
