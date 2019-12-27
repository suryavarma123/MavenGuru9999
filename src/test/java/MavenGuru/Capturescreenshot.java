package MavenGuru;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.xml.serializer.utils.Utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;


@Test
public class Capturescreenshot {
	
	public FirefoxDriver driver;
	
  public void f1() {
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  driver = new FirefoxDriver();
	  driver.get("http://flipkart.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	// Take screenshot and store as a file format
	java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("C:\\Users\\surya\\Desktop\\testing//error.png"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	 }
	  
	
	
  }

  @AfterTest
  public void afterTest() {
  }

}
