package webdriverpack;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function7_Actions {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		//	d1.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor) d1; 
		
	//	jse.executeScript("scroll(0,950)");
		//jse.executeScript("document.getElementById('datepicker2').value='29/02/2017'");
		WebElement ele1 = d1.findElement(By.xpath("//textarea[normalize-space()='textarea']"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);",ele1);
		ele1.sendKeys("hcl");
		
	 
	 }
}