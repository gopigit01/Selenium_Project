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

public class Function7_DatePicker_HandOn {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Datepicker.html");
		d1.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) d1; 
		
		jse.executeScript("document.getElementById('datepicker1').value='29/02/2017'");
		jse.executeScript("document.getElementById('datepicker2').value='29/02/2017'");
	 }
}