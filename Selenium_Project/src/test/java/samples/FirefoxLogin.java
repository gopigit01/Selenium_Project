package samples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirefoxLogin {
  @Test
  public void a() {
	  System.out.println("valid Login");
	  System.out.println("Thred valuse is " + Thread.currentThread().getId());
	  Reporter.log("FF");
  }
  
  @Test
  public void b() {
	  System.out.println("Invalid Login");
	  System.out.println("Thred valuse is " + Thread.currentThread().getId());
	  Reporter.log("CB");
  }
}
