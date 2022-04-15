package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function4_Frames_HandsOn {
  @Test
  public void f() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Frames.html");
		d1.manage().window().maximize();
		d1.switchTo().frame("singleframe");
		// d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("HCL");//single
		d1.findElement(By.xpath("//input[@type='text']")).sendKeys("HCL");// single

		Thread.sleep(2000);
		d1.switchTo().defaultContent();
		d1.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement outerframe = d1.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		d1.switchTo().frame(outerframe);
		WebElement innerframe = d1.findElement(By.xpath("/html/body/section/div/div/iframe"));
		d1.switchTo().frame(innerframe);
		d1.findElement(By.xpath("//input[@type='text']")).sendKeys("HCL Tech");
	 
	 }
}