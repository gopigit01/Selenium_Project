package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function4 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
	  WebDriver d1;
	  
	  d1 = new ChromeDriver();
	  
	  d1.get("http://www.leafground.com/pages/Dropdown.html");
	  d1.manage().window().maximize();
	  Select sel = new Select(d1.findElement(By.id("dropdown1")));// select class drop down
	  
	  sel.selectByVisibleText("Appium");
	  Thread.sleep(4000);
	  
	  sel.selectByIndex(1);
	  Thread.sleep(4000);
	  
	  sel.selectByValue("4");
	  Thread.sleep(4000);
	  
	 System.out.println (sel.isMultiple());
	 
	 Select sel1 = new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[1]")));// select class drop down
	 sel1.selectByVisibleText("Selenium");
	 Thread.sleep(1000);
	// sel1.selectByVisibleText("UFT/QTP");
	 //Thread.sleep(1000);
	 
	  
	 System.out.println (sel.isMultiple());
	 
	  
	
  }
}