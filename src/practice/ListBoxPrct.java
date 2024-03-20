package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxPrct {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pallavi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chaudhari");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Pallavi@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abc@2918");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		
		s.selectByVisibleText("26");
		

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		
		s1.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		
		s2.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).click();
		
		Thread.sleep(3000);
		
		
		

	}

}
