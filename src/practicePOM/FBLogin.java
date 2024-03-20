package practicePOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin {
	@FindBy(id= "email")private WebElement userId;
	@FindBy(id= "pass")private WebElement pwd;
	@FindBy(xpath = "//button[@name='login']")private WebElement loginButton;
	
	public FBLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public Boolean userIdFeildIsEnabled() {
		boolean value = userId.isEnabled();
		return value;
	}
	
	public void eneterUserId() throws EncryptedDocumentException, IOException {
		userId.clear();
		userId.sendKeys(Utility.readDataFromExcel(0, 0));
	}
	
	public void enetrPwd() throws EncryptedDocumentException, IOException {
		pwd.clear();
		pwd.sendKeys(Utility.readDataFromExcel(0, 1));
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
