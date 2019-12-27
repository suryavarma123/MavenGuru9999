package MavenGuru;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class MaleValidation {
 public WebDriver driver;
	@Test(priority = 1)
  public void Login() {
		driver.findElement(By.xpath("html/body/div[2]/div/form/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("html/body/div[2]/div/form/input[2]")).sendKeys("admin");
		driver.findElement(By.xpath("html/body/div[2]/div/form/input[3]")).click();
	}
	@Test(priority = 2)
	public void Registration() throws InterruptedException
	{
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(5000);
	}
	@Test(priority = 3)
	public void Validation()
	{
		WebElement ele = driver.findElement(By.name("SEX"));
		List<WebElement> options = new Select(ele).getOptions();
		boolean present = false;
		for(int i=0; i<options.size();i++)
		{
			if(options.get(i).getText().equalsIgnoreCase("Male"))
			{
				present=true;
			
			}
		}
	
		if(present)
		{
			System.out.println("Male is present");
		}
		else
		{
			System.out.println("Male is not present");
		}
	}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\Desktop\\chromedriver.exe\\");
	  driver =new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
