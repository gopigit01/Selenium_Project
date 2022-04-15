package webdriverpack;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Function7_Waits {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		//d1.get("http://www.leafground.com/pages/Edit.html");
		d1.get("http://www.leafground.com/pages/drag.html");
		
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele1 = 	d1.findElement(By.id("draggable"));
		
		
		//WebDriverWait wait = new WebDriverWait(d1,30);
		FluentWait var = new FluentWait(d1);
		//var.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggbble")));
		var.withTimeout(20, TimeUnit.SECONDS);
		var.pollingEvery(5, TimeUnit.SECONDS);
		
		Actions act = new Actions(d1);
//		act.sendKeys(ele1, "HCL");
//		.doubleClick()
//		.contextClick()
//		.build()
//		.perform();
		
		act.dragAndDropBy(ele1, 350, 250).build().perform();
		
	 
	 }
}