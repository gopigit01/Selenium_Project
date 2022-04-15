package samples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=2, groups="smoke")
  public void f() {
	  System.out.println("f");
  }
  
  @Test(priority=1, groups="regression")
  public void f1() {
	  System.out.println("f1");
  }
  
  @Test(dependsOnMethods="k1")
  public void k() {
	  System.out.println("k");
  }
  
  @Test
  public void k1() {
	  System.out.println("k1");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuit");
	  
  }

}
