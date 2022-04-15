package funtionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectrepository.Elements;

public class DataDrivenInvalidLogin {
	@Test
	public void f() throws IOException {

		WebDriver d1;
		FileInputStream fi = new FileInputStream(
				"D:\\SeleniumPractice\\Selenium_Project\\src\\test\\java\\webdriverpack\\Config.properties");
		Properties prop = new Properties();
		prop.load(fi);
		String browser = prop.getProperty("browser_name");
		String path = prop.getProperty("driver_path");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path);
			d1 = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", path);
			d1 = new FirefoxDriver();
		}

		else {
			System.setProperty("webdriver.ie.driver", path);
			d1 = new InternetExplorerDriver();
		}
		// WebDriver d1= new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.manage().window().maximize();

		FileInputStream f1 = new FileInputStream("Reports//Test3.xlsx");
		XSSFWorkbook w2 = new XSSFWorkbook(f1);
		XSSFSheet s2 = w2.getSheetAt(0);
		PageFactory.initElements(d1, Elements.class);

		for (int i = 1; i < s2.getLastRowNum(); i++) {

			XSSFRow current_cell = s2.getRow(i);
			String un = current_cell.getCell(0).getStringCellValue();
			String pw = current_cell.getCell(1).getStringCellValue();

			d1.get("https://ksrtc.in/oprs-web/login/show.do");
			// PageFactory.initElements(d1, Elements.class);
			// d1.findElement(By.id("userName")).sendKeys(un);
			// d1.findElement(By.name("password")).sendKeys(pw);
			// d1.findElement(By.id("submitBtn")).click();//D:\General\Reports\XLSXD:\General\Reports\XLSX

			// defined object repository
			Elements.DataDrivenInvlaidUserName.sendKeys(un);
			Elements.DataDrivenInvlaidPassword.sendKeys(pw);
			Elements.DataDrivenInvlaidSubmit.click();
		}

		TakesScreenshot t1 = (TakesScreenshot) d1;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumPractice\\Selenium_Project\\ScreenShots\\InvalidLoginScreen2.jpg");
		org.openqa.selenium.io.FileHandler.copy(source, dest);
		
		d1.close();

	}

}
