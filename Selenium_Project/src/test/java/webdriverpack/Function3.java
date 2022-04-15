package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function3 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
	  WebDriver d1;
	  
	  d1 = new ChromeDriver();
	  
	//  d1.get("http://www.leafground.com/pages/table.html");// table element
	  d1.get("http://demo.automationtesting.in/Register.html");
	  d1.manage().window().maximize();
	// WebElement ele1 = d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[5]/td[5]"));
	 //System.out.println(ele1.getText());
	 
	//div[@id='msdd'] //*[@id="basicBootstrapForm"]/div[7]/div/multi-select/div[2]/ul
	 d1.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
	 Thread.sleep(4000);
	 d1.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]")).click();
	 d1.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[2]")).click();
	  d1.findElement(By.id("firstpassword")).sendKeys("firstpassword");;
	  d1.findElement(By.id("secondpassword")).sendKeys("second password");
	  d1.findElement(By.id("submitbtn")).click(); //Button1
	// List<WebElement> ele2 = d1.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li/a"));
	// List<WebElement> ll = d1.findElements(By.xpath("//*[@id=\"msdd\"]"));
	 
  
	  
	  
  }
}

