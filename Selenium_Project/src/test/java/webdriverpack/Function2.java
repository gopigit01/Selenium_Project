package webdriverpack;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Function2 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chrome\\chromedriver.exe");
	  WebDriver d1;
	  
	  d1 = new ChromeDriver();
	  
//	  d1.get("http://www.leafground.com");
//	  d1.findElement(By.linkText("Edit")).click();
//	  d1.findElement(By.id("email")).sendKeys("1@1.com");;
//	  d1.findElement(By.cssSelector("input[value=\"Append \"]")).sendKeys("S");
//	  d1.findElement(By.name("username")).sendKeys("HCL");
//	  //d1.findElement(By.cssSelector("input[value=\"TestLeaf\"]")).sendKeys("SS");
//	  d1.findElement(By.xpath("//input[@value=\"Clear me!!\"]")).sendKeys("SSS");
//	//  d1.findElement(By.xpath("//input[@name='username'][2]")).sendKeys("FFF");
//	  d1.findElement(By.xpath("//img[@src=\"../images/testleaf_logo.png\"]")).click();
//	  
	  
	  d1.get("https://www.makemytrip.com/");
	 
	  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//  d1.manage().window().maximize();
	//  d1.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div/p/text()")).click();
	//  d1.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
	 d1.findElement(By.xpath("//label[@class='appendBottom2 font14 latoBold blackText cursorPointer']")).click();
	 System.out.println(d1.getTitle());
	//  d1.findElement(By.xpath("//input[@id='username']")).sendKeys("gopikrishnagnsty@gmail.com");
	// Thread.sleep(20);
	d1.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[3]/div")).click();
	Thread.sleep(1000);
	
	//System.out.println(d1.getTitle());
	//d1.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[3]/div/span[2]/span")).click();
	Thread.sleep(2000);///span[contains(text(),'Login with Google')]
	//  d1.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("gopikrishnagnsty@gmail.com");
	//d1.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
	//System.out.println(d1.getTitle());
	
	Set<String>  window_values = d1.getWindowHandles();
	Iterator<String> itr = window_values.iterator();
	
	String w1 = itr.next();
	String w2=itr.next();
	
	d1.switchTo().window(w2);
	d1.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hh@test.com");
	System.out.println(d1.getTitle());
	d1.findElement(By.xpath("//span[normalize-space()='Next']")).click();
//	d1.findElement(By.xpath("//input[@id='username']")).sendKeys("ttt@test.com");
//	d1.findElement(By.xpath("//button[@class='capText font16']")).click();
	//d1.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
	//System.out.println(d1.getTitle());
	//d1.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
	//d1.findElement(By.id("identifierId")).sendKeys("gopikrishnagnsty@gmail.com");//span[contains(text(),'Login with Google')]
	//WebElement button1=d1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]"));
	//d1.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/buttons")).click();
	//d1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
	//JavascriptExecutor jse = (JavascriptExecutor) d1; 
	//WebElement button2=d1.findElement(By.xpath("//button[@class='capText font16']"));
	
	//jse.executeScript("arguments[0].click();", button2);
		//jse.executeScript("arguments[0].click();", button1);
	//  d1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")).click();
	//	Thread.sleep(10);
	//	d1.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");;
		//d1.findElement(By.xpath("//button[@class='capText font16']")).click();
		
		//input[@id='password'] 
  	}
	  
  }
	  
	 