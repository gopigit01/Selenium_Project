package funtionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

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

public class SearchValidLocation {
	@Test
	public void f() throws InterruptedException, IOException, Exception {

		WebDriverManager.firefoxdriver().browserVersion("98.0.2").setup();
		WebDriver d1;
		d1 = new FirefoxDriver();
		/*
		 * FileInputStream fi = new
		 * FileInputStream("D:\\SeleniumPractice\\Selenium_Project\\src\\test\\java\\w"
		 * + "ebdriverpack\\Config.properties"); Properties prop = new Properties();
		 * prop.load(fi);
		 * 
		 * String browser = prop.getProperty("browser_name"); String path =
		 * prop.getProperty("driver_path");
		 * 
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty("webdriver.chrome.driver", path); d1 = new ChromeDriver();
		 * } else if(browser.equalsIgnoreCase("firefox")) {
		 * 
		 * System.setProperty("webdriver.gecko.driver", path); d1 = new FirefoxDriver();
		 * }
		 * 
		 * else { System.setProperty("webdriver.ie.driver", path); d1 = new
		 * InternetExplorerDriver(); }
		 */

		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// d1.get("https://ksrtc.in/oprs-web/");

		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		d1.manage().window().maximize();
		PageFactory.initElements(d1, Elements.class);
		// d1.findElement(By.name("userName")).sendKeys("gopikrishnagns@gmail.com");
		Elements.SearcInvalidPageUserName.sendKeys("gopikrishnagns@gmail.com");
		Thread.sleep(1000);
		// d1.findElement(By.name("password")).sendKeys("Eshi@123");
		Elements.SearcInvalidPageUserPassword.sendKeys("Eshi@123");
		// d1.findElement(By.id("submitBtn")).click();
		Elements.SearcInvalidPagesubmitBtn.click();
		// d1.findElement(By.id("fromPlaceName")).sendKeys("MYSOR");
		Elements.SearcInvalidPagefromPlaceName.sendKeys("MYSOR");
		// Thread.sleep(1000);
		// d1.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		// d1.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		Elements.SearcInvalidPagefromPlaceName.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		// d1.findElement(By.id("toPlaceName")).sendKeys("TIRUPATHI");
		Elements.SearcInvalidPageToPlaceName.sendKeys("TIRUPATHI");
		Thread.sleep(1000);
		// d1.findElement(By.id("toPlaceName")).sendKeys(Keys.DOWN);
		// Thread.sleep(1000);
		// d1.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
		Elements.SearcInvalidPageToPlaceName.sendKeys(Keys.ENTER);
		JavascriptExecutor jse = (JavascriptExecutor) d1;
		jse.executeScript("document.getElementById('txtJourneyDate').value='27/04/2022'");

		// d1.findElement(By.xpath("//button[normalize-space()='Search for
		// Bus']")).click();
		Elements.SearcInvalidPageClick.click();

		TakesScreenshot t1 = (TakesScreenshot) d1;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumPractice\\Selenium_Project\\ScreenShots\\SerachValidLocScreen1.jpg");
		org.openqa.selenium.io.FileHandler.copy(source, dest);

	}

}
