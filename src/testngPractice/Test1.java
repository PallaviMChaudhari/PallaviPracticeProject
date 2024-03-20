package testngPractice;

import org.testng.annotations.Test;

public class Test1 {
  @Test(groups = "smoke")
  public void A() {
	  System.out.println("A is running");
  }
  @Test(groups = "regression")
  public void B() {
	  System.out.println("B is running");
  }
  @Test(groups = "smoke")
  public void C() {
	  System.out.println("C is running");
  }
}
