package samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Elements;

public class LoginInvalid {
	
	@Test
	public void login_invalid() {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		  WebDriver d1;
		  
		  d1 = new ChromeDriver();
		
		  d1.get("https://www.google.com/");
		  d1.manage().window().maximize();
		  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Elements ele1 = new Elements();
		  ele1.EmailorMobileNumber(d1).sendKeys("123@test.com");
		  
	}

}
