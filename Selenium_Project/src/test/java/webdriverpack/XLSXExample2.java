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

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XLSXExample2 {
  @Test
  public void f() throws IOException, BiffException  {
	  
	
	 // WebDriverManager.chromedriver().setup();
	  WebDriverManager.firefoxdriver().browserVersion("98.0.2 ").setup();
	//  WebDriver d1= new ChromeDriver();
	  WebDriver d1= new FirefoxDriver();
	  d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	 d1.manage().window().maximize();
	// File fs = new File ("D:\\General\\Reports\\XLSX\\Test3.xlsx");
	
	 FileInputStream f1 = new FileInputStream("D:\\General\\Reports\\XLSX\\Test3.xlsx");
	
	XSSFWorkbook w2=new XSSFWorkbook(f1);
	XSSFSheet s2 = w2.getSheetAt(0);
	 
	for(int i=1; i<s2.getLastRowNum(); i++) {
		
		XSSFRow current_cell  = s2.getRow(i);
		String un = current_cell.getCell(0).getStringCellValue();
		String pw = current_cell.getCell(1).getStringCellValue();
		
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		d1.findElement(By.id("userName")).sendKeys(un);
		d1.findElement(By.name("password")).sendKeys(pw);
		d1.findElement(By.id("submitBtn")).click();//D:\General\Reports\XLSXD:\General\Reports\XLSX
	}
		
	}
  	
	  
  }
	  
	 