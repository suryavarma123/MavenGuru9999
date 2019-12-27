package MavenGuru;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SavaariValidation {
	public WebDriver driver;

  @Test
  public void fun() {
	  boolean str = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[1]")).isDisplayed();
	  System.out.println(str);
	  WebElement str1 = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[1]"));
	  if(str1.isEnabled())
	  {
		  System.out.println("Round trip is enable");
	  }
	  else
	  {
		  System.out.println("Round trip is not enable");
	  }
  }
  @BeforeTest
  public void beforeTest() {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\Desktop\\chromedriver.exe\\");
  driver = new ChromeDriver();
  driver.get("http://www.savaari.com");
  
  }

  @AfterTest
  public void afterTest() {
  }

}
