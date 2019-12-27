package MavenGuru;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assertvalidation {
	public WebDriver driver;
  @Test
  public void fun() {
	  String title = "google";
	  String GetTitle=driver.getTitle();
	  try
	  {
		  Assert.assertEquals(title, GetTitle);
		  System.out.println("Title Matched");
		  
	  }
	  catch(Throwable t)
	  {
		  System.out.println("Not matched");
	  }
	 }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\Desktop\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
