package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsStd {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	    WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
	    WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
	    Thread.sleep(5000);
		act.contextClick(right).click().perform();
		Thread.sleep(5000);
		//driver.switchTo().frame("iframe");

		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[5]")).click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		act.doubleClick(doubleClick).click().perform();
		Thread.sleep(5000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
 

	}
 
}
