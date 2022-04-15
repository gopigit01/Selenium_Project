package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function5_Frames {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
	  WebDriver d1;
	  d1 = new ChromeDriver();
	  //d1.get("http://www.leafground.com/pages/frame.html");
	  d1.get("http://demo.automationtesting.in/Frames.html");
	  d1.manage().window().maximize();
//	  d1.switchTo().frame(0);
//	  d1.findElement(By.id("Click")).click();
//	  d1.switchTo().defaultContent();
//	  
//	  WebElement element1= d1.findElement(By.xpath("//*[@src=\"page.html\"]"));
//	  d1.switchTo().frame(element1);
//	  d1.switchTo().frame("frame2");
//	  d1.findElement(By.id("Click1")).click();
//	  d1.switchTo().parentFrame();
	  
	  d1.findElement(By.linkText("Iframe with in an Iframe")).click();
//	  WebElement element1= d1.findElement(By.xpath("//*[@src=\"MultipleFrames.html\"]"));
//	  WebElement element2= d1.findElement(By.xpath("//*[@src=\"SingleFrame.html\"]"));
	//  WebElement element1= d1.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	 WebElement outerframe=d1.findElement(By.xpath("//*[@id='Multiple']/iframe"));
	  d1.switchTo().frame(outerframe);
	 // Thread.sleep(2000);
		  WebElement innerframe=d1.findElement(By.xpath("/html/body/section/div/div/iframe"));
	  d1.switchTo().frame(innerframe);
	  d1.findElement(By.xpath("//input[@type='text']")).sendKeys("HCL Tech");
	  
	  
	 
	 }
}