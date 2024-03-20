package practicePOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FbTesting extends Base {
	
  FBLogin fb;
  TryAnotherWay tr;
	
  @BeforeClass
  public void startBrowser() throws IOException {
	  LanuchBrowser();
	  
	  
  }
  
  @BeforeMethod
  public void InitialiseApp() throws EncryptedDocumentException, IOException {
      fb=new FBLogin(driver);
      tr=new TryAnotherWay(driver);
	  
	  fb.eneterUserId();
	  Utility.waitMethod(driver);
	  
	  fb.enetrPwd();
	  Utility.waitMethod(driver);
	  
	  
  } 
  
  @Test
  public void enabilityOfuseridField() {
	  Boolean value = fb.userIdFeildIsEnabled();
	  if(value==true) {
		  Reporter.log("Button is enabled",true);
	  }
	  else
	  {
		  Reporter.log("Button is not enabled",true);
	  }
	  
  }
  
  @Test
  
  public void invalidCredentials() throws EncryptedDocumentException, IOException{
	  
     fb.clickOnLoginButton();
	 Utility.waitMethod(driver);
	  
	 String value = tr.getErrorText();
	 System.out.println(value);
     Assert.assertEquals(value, Utility.readDataFromExcel(0, 2));
	    
	  
	  
  }
  
  @AfterClass
  public void closeApplication() throws InterruptedException {
	  closeBrowser();
  }
}
