package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Repository {

	public static WebDriver driver;
	@Test
	public static void login() {
		driver.findElement(Locators.username1).sendKeys(TestData.username1);
		driver.findElement(Locators.password1).sendKeys(TestData.Password);
		driver.findElement(Locators.Login).click();
	}
	
	@BeforeTest
	public static void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\Desktop\\chromedriver.exe\\");
		  driver = new ChromeDriver();
			driver.get(TestData.url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );  
		  
	}
	
	@AfterTest
	public static void teardown() {
		
	}
	
}