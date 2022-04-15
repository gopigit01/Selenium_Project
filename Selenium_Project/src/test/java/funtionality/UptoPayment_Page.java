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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.Elements;

public class UptoPayment_Page {
	@Test
	public void f() throws InterruptedException, IOException, Exception {

		WebDriver d1;
		WebDriverManager.firefoxdriver().browserVersion("98.0.2").setup();
		d1 = new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// d1.get("https://ksrtc.in/oprs-web/");

		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// d1.get("https://ksrtc.in/oprs-web/");

		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		d1.manage().window().maximize();
		PageFactory.initElements(d1, Elements.class);
		// d1.findElement(By.name("userName")).sendKeys("gopikrishnagns@gmail.com");
		Elements.UptoPaymentUserName.sendKeys("gopikrishnagns@gmail.com");
		Thread.sleep(1000);
		// d1.findElement(By.name("password")).sendKeys("Eshi@123");
		Elements.UptoPaymentPassword.sendKeys("Eshi@123");
		// d1.findElement(By.id("submitBtn")).click();
		Elements.UptoPaymentsubmitBtn.click();
		// d1.findElement(By.id("fromPlaceName")).sendKeys("MYSOR");
		Elements.UptoPaymentFromPlace.sendKeys("MYSOR");
		Thread.sleep(2000);
		// d1.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		// Thread.sleep(1000);
		// d1.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		Elements.UptoPaymentFromPlace.sendKeys(Keys.ENTER);

		// Thread.sleep(2000);

		// d1.findElement(By.id("toPlaceName")).sendKeys("TIRUPATHI");
		Elements.UptoPaymentToPlace.sendKeys("TIRUPATHI");
		Thread.sleep(1000);
		// d1.findElement(By.id("toPlaceName")).sendKeys(Keys.DOWN);
		// Thread.sleep(1000);
		// d1.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
		Elements.UptoPaymentToPlace.sendKeys(Keys.ENTER);
		JavascriptExecutor jse = (JavascriptExecutor) d1;
		jse.executeScript("document.getElementById('txtJourneyDate').value='28/04/2022'");

		// d1.findElement(By.xpath("//button[normalize-space()='Search for
		// Bus']")).click();
		Elements.UptoPaymentSerachBusButton.click();

		// jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);

		WebElement ele1 = d1.findElement(By.xpath("//*[@id=\"SrvcSelectBtnForward0\"]"));

		jse.executeScript("arguments[0].click();", ele1);
		// ele1.click();

		// Thread.sleep(1000);
		// d1.findElement(By.id("SrvcSelectBtnForward0")).click();

		Thread.sleep(1000);
		jse.executeScript("scroll(0,950)");
		d1.findElement(By.id("Forward48")).click();
		// d1.findElement(By.id("passengerNameForward0")).sendKeys("ABC");
		Elements.UptoPaymentPassengerName.sendKeys("ABC");
		Select s1 = new Select(d1.findElement(By.id("genderCodeIdForward0")));
		s1.selectByVisibleText("MALE");
		Thread.sleep(1000);
		// d1.findElement(By.id("passengerAgeForward0")).sendKeys("30");
		// //concessionIdsForward0
		Elements.UptoPaymentPassengerAge.sendKeys("30");

		Select s2 = new Select(d1.findElement(By.id("concessionIdsForward0")));
		s2.selectByVisibleText("GENERAL PUBLIC");
		Thread.sleep(2000);
		d1.findElement(By.id("concessionIdsForward0")).sendKeys(Keys.ENTER);
		// d1.findElement(By.id("toPlaceName")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		// d1.findElement(By.id("PgBtn")).click();
		Elements.UptoPaymentPageButton.click();

		TakesScreenshot t1 = (TakesScreenshot) d1;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumPractice\\Selenium_Project\\ScreenShots\\UptoPaymentScreen1.jpg");
		org.openqa.selenium.io.FileHandler.copy(source, dest);
	}

}
