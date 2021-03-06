package funtionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.Elements;

public class RegPageInvalid1 {
	@Test
	public void f() throws InterruptedException, IOException, Exception {

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver d1= new ChromeDriver();
		 */

		WebDriverManager.firefoxdriver().browserVersion("98.0.2 ").setup();
		WebDriver d1 = new FirefoxDriver();

		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.get("https://ksrtc.in/oprs-web/user/add.do");
		d1.manage().window().maximize();
		PageFactory.initElements(d1, Elements.class);
		JavascriptExecutor jse = (JavascriptExecutor) d1;
		jse.executeScript("document.getElementById('email').value='gopikrishnagnsty1234@gmail.com'"); // fullName
		jse.executeScript("document.getElementById('fullName').value='GGG'");

		TakesScreenshot t1 = (TakesScreenshot) d1;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumPractice\\Selenium_Project\\ScreenShots\\FailRegScreen1.jpg");
		org.openqa.selenium.io.FileHandler.copy(source, dest);

		jse.executeScript("document.getElementById('mobileNo').value='1231231234'");

		// d1.findElement(By.xpath("//input[@title='Add']")).click();
		Elements.RegAddButton.click();
		d1.switchTo().alert().accept();
		d1.close();
	}

}
