package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fstd {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		String txt = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		
		System.out.println(txt);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc patil");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement animal = driver.findElement(By.id("animals"));
		
		Select s=new Select(animal);
		s.selectByVisibleText("Baby Cat");
		
		driver.switchTo().defaultContent();

		 
	}

}
