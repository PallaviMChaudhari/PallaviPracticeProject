  package testngPractice;

import org.testng.annotations.DataProvider;

public class Dataset {
	@DataProvider(name = "getData")
	public Object[][] getData(){
		Object[][] credentials=new Object[2][2];
		credentials[0][0]= "abc@gmail.com";
		credentials[0][1]="password";
		credentials[1][0]="def@gmail.com";
		credentials[1][1]="pass";
		
		return credentials;
		
	}

}
