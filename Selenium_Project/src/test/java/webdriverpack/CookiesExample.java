package webdriverpack;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
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

public class CookiesExample {
  @Test
  public void f() throws InterruptedException, IOException, Exception {
	  
	  WebDriver d1=null;
	  FileInputStream fi = new FileInputStream("D:\\SeleniumPractice\\Selenium_Project\\src\\test\\java\\webdriverpack\\Config.properties");
	  Properties prop = new Properties();
	  prop.load(fi);
	  
	  String browser = prop.getProperty("browser_name");
	  String path = prop.getProperty("driver_path");
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", path);
	  d1 = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {

		  System.setProperty("webdriver.gecko.driver", path);
		  d1 = new FirefoxDriver();
		  }
		  
	  else
	  {
		  System.setProperty("webdriver.ie.driver", path);
		  d1 = new InternetExplorerDriver();
	  }
	  
	  
	  d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  d1.get("https://ksrtc.in/oprs-web/login/show.do");
	  d1.manage().window().maximize();
	  d1.findElement(By.name("userName")).sendKeys("test.com");
	  d1.findElement(By.name("password")).sendKeys("11@test.com");
	  d1.findElement(By.xpath("//input[@id='submitBtn']")).click();
	 
	  File fs = new File("D:\\General\\Reports\\cookies1.data");
	  
	  try {
	  
		  fs.createNewFile();
		  FileWriter fw = new FileWriter(fs);
		  BufferedWriter bw = new BufferedWriter(fw);
		  
		  
		  for (Cookie ck:d1.manage().getCookies())
		  {
			  bw.write(ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry());
			  bw.newLine();
			  
			  Cookie c1 = new Cookie("cookie2","12377777s777");
			  d1.manage().addCookie(c1);
			  
			  System.out.println(d1);
			  
			  d1.manage().getCookieNamed("cookie2");
			  d1.manage().deleteCookie(c1);
			  System.out.println( d1.manage().getCookieNamed("cookie2"));
		  }
		bw.close();
		fw.close();
	 
	
	  }
	  
	  catch(Exception e)
	  {
		  System.out.println("Catched");
	  }
	 
	  
		  
  	}
	  
  }
	  
	 