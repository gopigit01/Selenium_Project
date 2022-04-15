package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function5_Popups_HandsOn {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		d1.switchTo().alert().accept();
		
		d1.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		d1.switchTo().alert().dismiss();
		
		d1.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		d1.switchTo().alert().sendKeys("HCL");
		Thread.sleep(1000);
		d1.switchTo().alert().accept();
	 }
}