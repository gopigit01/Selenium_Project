package webdriverpack;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

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

public class Upload1 {
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
// d1.get("https://ksrtc.in/oprs-web/");

	 d1.get("https://www.ilovepdf.com/excel_to_pdf");
	d1.findElement(By.xpath("//a[@id='pickfiles']")).click();
	Thread.sleep(1000);
//	 d1.manage().window().maximize();
	// d1.findElement(By.xpath("//span[normalize-space()='Select EXCEL files']")).click();
	// d1.findElement(By.xpath("//a[@id='pickfiles']")).click(); // C:\Users\Gopi
	String temp1 = "D:\\General\\Reports\\Test1.xls";
	StringSelection sc = new StringSelection(temp1);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
	
	Robot r2 = new Robot();
	r2.keyPress(KeyEvent.VK_CONTROL);
	r2.keyPress(KeyEvent.VK_V);
	Thread.sleep(1000);
	r2.keyRelease(KeyEvent.VK_V);
	r2.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(1000);
	r2.keyPress(KeyEvent.VK_ENTER);
	r2.keyRelease(KeyEvent.VK_ENTER);
	
	
  	}
	  
  }
	  
	 