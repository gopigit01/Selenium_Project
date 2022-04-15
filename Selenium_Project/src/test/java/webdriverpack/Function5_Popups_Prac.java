package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function5_Popups_Prac {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://www.leafground.com/pages/Alert.html");
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Thread.sleep(1000);
		d1.switchTo().alert().accept();
		Thread.sleep(2000);
		d1.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Thread.sleep(1000);
		d1.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		d1.switchTo().alert().sendKeys("HCL");
		Thread.sleep(1000);
		d1.switchTo().alert().accept();
		
		Thread.sleep(1000);
		d1.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		System.out.println(d1.switchTo().alert().getText());
		d1.switchTo().alert().accept();

		Thread.sleep(1000);
		d1.findElement(By.xpath("//button[@id='btn']")).click();
		String s1 = d1.findElement(By.xpath("/html/body/div[2]/div/div[1]")).getText();
		System.out.println(s1);
		d1.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();// //button[@class='swal-button swal-button--confirm']
		
	 
	 }
}