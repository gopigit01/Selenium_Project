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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function7_DragAndDrop {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		//d1.get("http://www.leafground.com/pages/Edit.html");
		d1.get("http://www.leafground.com/pages/drag.html");
		d1.manage().window().maximize();
		WebElement ele2 = d1.findElement(By.id("draggable"));
		Actions act = new Actions(d1);
	
		act.dragAndDropBy(ele2, 150, 100).build().perform();
		
		
	 
	 }
}