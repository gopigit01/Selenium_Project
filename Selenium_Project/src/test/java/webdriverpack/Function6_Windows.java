package webdriverpack;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function6_Windows {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://www.leafground.com/pages/Window.html");
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//button[@id='home']")).click();
		System.out.println(d1.getTitle());
		
		Set<String>  window_values = d1.getWindowHandles();
		Iterator<String> itr = window_values.iterator();
		
		String w1 = itr.next();
		String w2=itr.next();
		
		d1.switchTo().window(w2);
		System.out.println(d1.getTitle());
		System.out.println(w1);
		System.out.println(w2);
	 
	 }
}