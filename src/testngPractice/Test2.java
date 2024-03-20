package testngPractice;

import org.testng.annotations.Test;

public class Test2 {
  @Test(groups = "regression")
  public void D() {
	  System.out.println("D is running");
  }
  @Test(groups = "regression")
  public void E() {
	  System.out.println("E is running");
  }
  @Test(groups = "smoke")
  public void F() {
	  System.out.println("F is running");
  }
}
