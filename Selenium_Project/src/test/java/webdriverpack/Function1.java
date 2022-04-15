package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function1 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
	  WebDriver d1;
	  
	  d1 = new ChromeDriver();
	  
	 // d1.get("http://www.leafground.com/"); ////*[@id="basicBootstrapForm"]/div[2]/div/textarea
	  d1.get("http://demo.automationtesting.in/Register.html");
	  d1.manage().window().maximize();
	  d1.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("FN");
	//  d1.findElement(By.className("class=\"form-control ng-pristine ng-invalid ng-invalid-required ng-touched\"")).sendKeys("FN");
	  d1.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("LN");
	  d1.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("123");
	  d1.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
	  d1.findElement(By.cssSelector("input[type='tel']")).sendKeys("7898765489");
	  d1.findElement(By.cssSelector("input[value='FeMale']")).click();
	  d1.findElement(By.cssSelector("input[value='Cricket']")).click();
	  d1.findElement(By.cssSelector("input[value='Movies']")).click();
	  d1.findElement(By.cssSelector("input[value='Hockey']")).click();
	  
	//  d1.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/label")).click();
	  Thread.sleep(4000);
	  d1.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
	  Thread.sleep(4000);
	  d1.findElement(By.id("firstpassword")).sendKeys("firstpassword");;
	  d1.findElement(By.id("secondpassword")).sendKeys("second password");
	  
	//body//body//body//*[@id="msdd"]/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]
	 
	//body//div[@id='msdd']
	  Select sel = new Select(d1.findElement(By.id("Skills")));
	  sel.selectByVisibleText("Android");
	  // //span[@role='combobox']
	// d1.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
	 d1.findElement(By.xpath("//span[@role='combobox']")).click();
	
	 d1.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Australia");
	 d1.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ARROW_DOWN);
	 d1.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
	 d1.findElement(By.id("submitbtn")).submit();
	 
	 Select year = new Select(d1.findElement(By.id("yearbox")));
	 year.selectByVisibleText("1999");// 
	 
	 Select month = new Select(d1.findElement(By.xpath("//select[@placeholder='Month']")));
	 month.selectByIndex(5); 
	 
	 Select day = new Select(d1.findElement(By.id("daybox")));
	 
	 day.selectByVisibleText("7");
	 d1.findElement(By.id("submitbtn")).click(); //Button1
	  
	  
	  
  }
}
