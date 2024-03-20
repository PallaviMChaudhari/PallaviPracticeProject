package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFbWithSikuli {
	WebDriver driver=null;
	
	@BeforeMethod
	public void lanuchFb() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
	}
	
	@Test
	public void loginzToFb() throws InterruptedException, FindFailed {
		Screen sr=new Screen();
		
		Pattern username= new Pattern("D:\\sikuli\\userName.png");
		Pattern pwd=new Pattern("D:\\sikuli\\pwd.png");
		Pattern loginBtn=new Pattern("D:\\sikuli\\login_btn.png");
		
		sr.wait(username,5);
		sr.type(username, "pallavichaudhari@gmail.com");
		sr.type(pwd, "Pallavi@2918");
		sr.click(loginBtn);
		
		
		
	}
	
	 

}
