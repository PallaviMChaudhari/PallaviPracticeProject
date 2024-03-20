package testngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActiTimeLoginDataP {
	
  WebDriver driver=null;
	
  @BeforeTest
  public void launchBrowser() {
	  driver=new ChromeDriver();
	  driver.get("https://integrator.actitime.com/auth/at");
	  driver.manage().window().maximize();
	  
  }
  
  @Test(dataProvider = "getData",dataProviderClass = testngPractice.Dataset.class)
  public void login(String uname,String pass) {
	  driver.findElement(By.name("username")).sendKeys(uname);
	  
	  driver.findElement(By.name("password")).sendKeys(pass);
	  
  }
  /*@AfterMethod
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
	  
  }*/
}
