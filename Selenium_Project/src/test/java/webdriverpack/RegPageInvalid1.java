package webdriverpack;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.Elements;

public class RegPageInvalid1 {
  @Test
  public void f() throws InterruptedException, IOException, Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver d1= new ChromeDriver();
	 
	 d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// d1.get("https://ksrtc.in/oprs-web/"); //div.form-label-group:nth-child(2) > label:nth-child(2)
	 d1.get("https://ksrtc.in/oprs-web/user/add.do");
	d1.manage().window().maximize();
	 
	JavascriptExecutor jse = (JavascriptExecutor) d1; 
	 jse.executeScript("document.getElementById('email').value='gopikrishnagnsty1234@gmail.com'"); // fullName
	 jse.executeScript("document.getElementById('fullName').value='GGG'");
	 jse.executeScript("document.getElementById('mobileNo').value='1231231234'");
	
	// d1.findElement(By.xpath("//input[@title='Add']")).click();
	 Elements.RegAddButton(d1);
	 
	 
	}
	  
  }
	  
	 