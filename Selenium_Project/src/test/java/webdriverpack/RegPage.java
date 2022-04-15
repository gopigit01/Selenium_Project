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

public class RegPage {
  @Test
  public void f() throws InterruptedException, IOException, Exception {
	  
//	  WebDriver d1=null;
//	  FileInputStream fi = new FileInputStream("D:\\SeleniumPractice\\Selenium_Project\\src\\test\\java\\webdriverpack\\Config.properties");
//	  Properties prop = new Properties();
//	  prop.load(fi);
//	  
//	  String browser = prop.getProperty("browser_name");
//	  String path = prop.getProperty("driver_path");
//	  
//	  if(browser.equalsIgnoreCase("chrome"))
//	  {
//	  System.setProperty("webdriver.chrome.driver", path);
//	  d1 = new ChromeDriver();
//	  }
//	  else if(browser.equalsIgnoreCase("firefox"))
//	  {
//
//		  System.setProperty("webdriver.gecko.driver", path);
//		  d1 = new FirefoxDriver();
//		  }
//		  
//	  else
//	  {
//		  System.setProperty("webdriver.ie.driver", path);
//		  d1 = new InternetExplorerDriver();
//	  }
	  

//	  WebDriverManager.firefoxdriver().setup();
//	  WebDriver d1= new FirefoxDriver();
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver d1= new ChromeDriver();
	 
	 d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// d1.get("https://ksrtc.in/oprs-web/"); //div.form-label-group:nth-child(2) > label:nth-child(2)
	 d1.get("https://ksrtc.in/oprs-web/user/add.do");
	//d1.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
	//Thread.sleep(1000);
	//d1.findElement(By.xpath("//a[@class='alinkColorBold']")).click();////a[@class='alinkColorBold']
	d1.manage().window().maximize();
	 
	// WebDriverWait t = new WebDriverWait(d1, 20); 
	// t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='email']"))).sendKeys("123");;  
//	 //t.until(ExpectedConditions.elementToBeClickable(element));
	
	JavascriptExecutor jse = (JavascriptExecutor) d1; 
	 jse.executeScript("document.getElementById('email').value='gopikrishnagnsty1234@gmail.com'"); // fullName
	 jse.executeScript("document.getElementById('fullName').value='GGG'");
	 jse.executeScript("document.getElementById('mobileNo').value='6786787892'");
	
	 d1.findElement(By.xpath("//input[@title='Add']")).click();
	 
	 
	//d1.findElement(By.xpath("//label[@for='email']")).sendKeys("gopikrishnagns1111111@gmail.com");
	
//	 d1.findElement(By.id("fullName")).sendKeys("Gopi");
	// d1.findElement(By.id("mobileNo")).sendKeys("12345689");
	 //d1.findElement(By.name("SaveBtn")).click();
	// Thread.sleep(2000);
	
	//d1.findElement(By.xpath("//label[@for='fullName']")).sendKeys("123");
  	}
	  
  }
	  
	 