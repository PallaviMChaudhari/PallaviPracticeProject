package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryAnotherWay {
	@FindBy(xpath = "//div[@class='_9ay7']")private WebElement errorMessage;
	
	public TryAnotherWay(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public String getErrorText() {
		String value = errorMessage.getText();
		System.out.println(value);
		return value;
		
	}

}
