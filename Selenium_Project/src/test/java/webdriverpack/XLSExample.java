package webdriverpack;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XLSExample {
  @Test
  public void f() throws IOException, BiffException  {
	  
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

	 
	 d1.manage().window().maximize();
	 File fs = new File ("D:\\General\\Reports\\XLS\\Test2.xls");
	
//	FileInputStream f1 = new FileInputStream("D:\\General\\Reports\\XLS.Test2.xls");
	
	Workbook w1= Workbook.getWorkbook(fs);
	Sheet s1 = w1.getSheet(0);
	 
	for(int i=1; i<s1.getRows(); i++) {
		
		String us= s1.getCell(0,i).getContents();
		String pw=s1.getCell(1,i).getContents();
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		d1.findElement(By.id("userName")).sendKeys(us);
		d1.findElement(By.name("password")).sendKeys(pw);
		d1.findElement(By.id("submitBtn")).click();//D:\General\Reports\XLSXD:\General\Reports\XLSX
	}
		
	}
  	
	  
  }
	  
	 